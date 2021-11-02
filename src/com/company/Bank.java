package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {

    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {

        Szamla ujSzamla;

        if (hitelKeret <= 0) {

            ujSzamla = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(ujSzamla);

        } else {

            ujSzamla = new megtakaritasiSzamla(tulajdonos);
            szamlaLista.add(ujSzamla);

        }

        return ujSzamla;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {

        int osszEgyenleg = 0;

        for (Szamla item : szamlaLista) {
            osszEgyenleg += item.getAktualisEgyenleg();
        }

        return osszEgyenleg;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {

        Szamla legnagyobbEgyenleg = szamlaLista.get(0);

        for (Szamla item : szamlaLista) {

            if (item.getAktualisEgyenleg() > legnagyobbEgyenleg.getAktualisEgyenleg()) {

                legnagyobbEgyenleg = item;

            }
        }

        return legnagyobbEgyenleg;

    }

    public long getOsszhitelkeret() {

        long osszeg = 0;

        for (Szamla item : szamlaLista) {

            osszeg += ((HitelSzamla) item).getHitelKeret();

        }
        return osszeg;
    }
}
