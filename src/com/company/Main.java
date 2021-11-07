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

        BankiSzolgáltatás bsz = new BankiSzolgáltatás(t);
        BankiSzolgáltatás bsz2 = new BankiSzolgáltatás(t2);

        System.out.println(bsz.getTulajdonos());
        System.out.println(bsz2.getTulajdonos());

        Számla sz = new HitelSzámla(t,50000);
        Számla sz2= new MegtakarításiSzámla(t2, 40000);

        Kártya k=sz.ujKartya("111");
        Kártya k2=sz2.ujKartya("222");

        sz.befizet(10000);
        sz2.befizet(100000);

        sz.kivesz(100000);
        sz2.kivesz(100);

        b.szamlanyitas(t,1000000);
        b.szamlanyitas(t2,10000);

        System.out.println(b);

        //System.out.println(b.getOsszhitelkeret());  majd rákérdezni, még mindig nem jó


        System.out.println(b.getLegnagyobbEgyenleguSzamla(t));
        System.out.println(b.getOsszegyenleg(t2));
        System.out.println(k.getKartyaSzam());
        System.out.println(k.vasarlas(100));
        System.out.println(k2.getTulajdonos().getNev());




    }
}