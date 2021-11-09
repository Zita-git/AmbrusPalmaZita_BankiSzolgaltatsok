package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new ArrayList<>();
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        Szamla ujSzamla;
        if (hitelKeret <= 0) {
            ujSzamla = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(ujSzamla);
        } else {
            ujSzamla = new MegtakaritasiSzamla(tulajdonos,hitelKeret);
            szamlaLista.add(ujSzamla);
        }
        return ujSzamla;
    }
    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int osszEgyenleg = 0;
        for (Szamla item: szamlaLista){
            osszEgyenleg += item.getAktualisEgyenleg();
        }
        return osszEgyenleg;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla legnagyobbEgyenleguSzamla = szamlaLista.get(0);
        for (Szamla item : szamlaLista) {
            if (item.getAktualisEgyenleg() > legnagyobbEgyenleguSzamla.getAktualisEgyenleg()) {
                legnagyobbEgyenleguSzamla = item;
            }
        }
        return legnagyobbEgyenleguSzamla;
    }

    public long getOsszhitelkeret(){
        long ossz=0;
        for (Szamla item : szamlaLista){
            ossz+=((HitelSzamla)item).getHitelKeret();
        }
        return ossz;
    }

}
