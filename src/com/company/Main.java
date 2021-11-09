package com.company;

public class Main {
    public static void main(String[] args) {

        Bank b = new Bank();

        Tulajdonos t = new Tulajdonos("Proba Egy");
        Tulajdonos t2 = new Tulajdonos("Proba Ketto");

        System.out.println(t.getNev());
        System.out.println(t2.getNev());

        t.setNev("Proba Egy setNev");
        System.out.println(t.getNev());
        System.out.println(t2.getNev());

        BankiSzolgaltatas bsz = new BankiSzolgaltatas(t);
        BankiSzolgaltatas bsz2 = new BankiSzolgaltatas(t2);

        System.out.println(bsz.getTulajdonos());
        System.out.println(bsz2.getTulajdonos());

        Szamla sz = new HitelSzamla(t,50000);
        Szamla sz2= new MegtakaritasiSzamla(t2, 40000);

        Kartya k=sz.ujKartya("111");
        Kartya k2=sz2.ujKartya("222");

        sz.befizet(10000);
        sz2.befizet(100000);

        sz.kivesz(100000);
        sz2.kivesz(100);

        b.szamlanyitas(t,1000000);
        b.szamlanyitas(t2,10000);

        System.out.println(b);

        //System.out.println(b.getOsszhitelkeret());   nem jó


        System.out.println(b.getLegnagyobbEgyenleguSzamla(t));
        System.out.println(b.getOsszegyenleg(t2));
        System.out.println(k.getKartyaSzam());
        System.out.println(k.vasarlas(100));
        System.out.println(k2.getTulajdonos().getNev());




    }
}