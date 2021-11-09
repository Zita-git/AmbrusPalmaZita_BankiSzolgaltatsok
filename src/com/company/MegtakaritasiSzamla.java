package com.company;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, double kamat) {
        super(tulajdonos);
        this.kamat = kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        boolean sikerultE=true;
        if (this.getAktualisEgyenleg()-osszeg<0){
            return false;
        }
        return sikerultE;
    }
    public void kamatJovairas(){
        //Nem tudom, hogyan kell kamatot jóváírni
    }
}
