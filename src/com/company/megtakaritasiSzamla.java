package com.company;

public class megtakaritasiSzamla extends Szamla {

    private double kamat;
    public static double alapKamat;

    public megtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        //a kép int-et kér, úgy döntöttem ezt round fügvénnyel oldom meg

        return Math.round(kamat);

    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {

        boolean sikerultE = true;

        if (getAktualisEgyenleg() - osszeg < 0) {

            sikerultE = false;

        }

        return sikerultE;
    }

    public void kamatJovairas() {

        //nem tudom, hogyan kell kamatot jóvá írni

    }
}