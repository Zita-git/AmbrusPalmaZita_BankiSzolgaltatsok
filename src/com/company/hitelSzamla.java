package com.company;

public class hitelSzamla extends Szamla{
    
    private final int hitelKeret;

    public hitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {

        super(tulajdonos);
        this.hitelKeret = hitelKeret;

    }

    public int getHitelKeret() {

        return hitelKeret;

    }

    @Override
    public boolean kivesz(int osszeg) {
        
        boolean lehetE = false;

        if(this.hitelKeret < getAktualisEgyenleg()) {

            super.aktualisEgyenleg-=osszeg;
            lehetE = true;

        }
        return lehetE;
    }
}
