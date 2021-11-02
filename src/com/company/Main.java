package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Tulajdonos> szamlaLista = new ArrayList<>();

    public static void main(String[] args) {

        Bank b = new Bank();

        Tulajdonos t1 = new Tulajdonos("Elek");
        Tulajdonos t2 = new Tulajdonos("Kata");

        megtakaritasiSzamla m1 = new megtakaritasiSzamla(t1);
        megtakaritasiSzamla m2 = new megtakaritasiSzamla(t2);

        hitelSzamla h1 = new hitelSzamla(t1, 80000);
        hitelSzamla h2 = new hitelSzamla(t2, 50000);

        Kartya k1 = m1.ujKartya("111");
        Kartya k2 = m2.ujKartya("222");

        h1.befizet(40000);
        h2.befizet(25000);

        b.szamlanyitas(t1,70000);
        b.szamlanyitas(t2,120000);

        szamlaLista.add(t1);
        szamlaLista.add(t2);

        System.out.println(szamlaLista);

        System.out.println(k1.getTulajdonos().getNev());
        System.out.println(k1.getKartyaSzam());

        System.out.println(k2.getTulajdonos().getNev());
        System.out.println(k2.getKartyaSzam());

        t1.setNev("Lajos");

        System.out.println(k2.getTulajdonos().getNev());
        System.out.println(k2.getKartyaSzam());


    }
}
