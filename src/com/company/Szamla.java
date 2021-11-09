package com.company;

public abstract class Szamla extends BankiSzolgaltatas {
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        this.aktualisEgyenleg+=osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos(), Szamla.this, kartyaszam);
    }

}
