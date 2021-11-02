package com.company;

public class Kartya extends BankiSzolgaltatas {

    private Szamla szamla;
    private final String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {

        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;

    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg) {

        //nem tudom értelmezni a feladatot

        return vasarlas(osszeg);
    }
}
