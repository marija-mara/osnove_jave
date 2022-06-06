package Makao;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Karta karta = new Karta(5,Karta.SRCE);
//        karta.stampaj();

        Scanner s = new Scanner(System.in);

        Igrac neca = new Igrac("Nemanja ");
        Igrac mara = new Igrac("Marija ");
        Igrac ana = new Igrac("Ana ");
        Igrac jas = new Igrac("Jas ");

        Makao m = new Makao(new Spil());
        m.pristupiStolu(neca);
        m.pristupiStolu(mara);
        m.pristupiStolu(ana);
        m.pristupiStolu(jas);

        m.podeliKarte();
        m.preseciSpil();

        while (!m.DaLiJeKrajIgre())
        {
            m.stampaj();

            System.out.println("Unesi kartu ");
            String znak=s.next();
            if (znak.equals("dalje"))
            {
                m.sledeci();
            }
            else if (znak.equals("vuci"))
            {
                m.izvuciKartu();
            }
            else
            {
                int broj=s.nextInt();
                m.odigrajKartu(broj, znak);
            }

        }
        m.VratiPobednika().stampaj();
    }
}
