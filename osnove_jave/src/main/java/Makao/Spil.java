package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Spil {
    ArrayList<Karta> karte = new ArrayList<>();
    private Random randomKarta = new Random();

    public Spil() {
        karte.add(new Karta(2, Karta.SRCE));
        karte.add(new Karta(3, Karta.SRCE));
        karte.add(new Karta(4, Karta.SRCE));
        karte.add(new Karta(5, Karta.SRCE));
        karte.add(new Karta(6, Karta.SRCE));
        karte.add(new Karta(7, Karta.SRCE));
        karte.add(new Karta(8, Karta.SRCE));
        karte.add(new Karta(9, Karta.SRCE));
        karte.add(new Karta(10,Karta.SRCE));
        karte.add(new Karta(11,Karta.SRCE));
        karte.add(new Karta(12,Karta.SRCE));
        karte.add(new Karta(13, Karta.SRCE));
        karte.add(new Karta(14, Karta.SRCE));

        karte.add(new Karta(2, Karta.LIST));
        karte.add(new Karta(3, Karta.LIST));
        karte.add(new Karta(4, Karta.LIST));
        karte.add(new Karta(5, Karta.LIST));
        karte.add(new Karta(6, Karta.LIST));
        karte.add(new Karta(7, Karta.LIST));
        karte.add(new Karta(8, Karta.LIST));
        karte.add(new Karta(9, Karta.LIST));
        karte.add(new Karta(10,Karta.LIST));
        karte.add(new Karta(11,Karta.LIST));
        karte.add(new Karta(12,Karta.LIST));
        karte.add(new Karta(13,Karta.LIST));
        karte.add(new Karta(14,Karta.LIST));

        karte.add(new Karta(2, Karta.KOCKA));
        karte.add(new Karta(3, Karta.KOCKA));
        karte.add(new Karta(4, Karta.KOCKA));
        karte.add(new Karta(5, Karta.KOCKA));
        karte.add(new Karta(6, Karta.KOCKA));
        karte.add(new Karta(7, Karta.KOCKA));
        karte.add(new Karta(8, Karta.KOCKA));
        karte.add(new Karta(9, Karta.KOCKA));
        karte.add(new Karta(10, Karta.KOCKA));
        karte.add(new Karta(11, Karta.KOCKA));
        karte.add(new Karta(12, Karta.KOCKA));
        karte.add(new Karta(13, Karta.KOCKA));
        karte.add(new Karta(14, Karta.KOCKA));

        karte.add(new Karta(2, Karta.DETELINA));
        karte.add(new Karta(3, Karta.DETELINA));
        karte.add(new Karta(4, Karta.DETELINA));
        karte.add(new Karta(5, Karta.DETELINA));
        karte.add(new Karta(6, Karta.DETELINA));
        karte.add(new Karta(7, Karta.DETELINA));
        karte.add(new Karta(8, Karta.DETELINA));
        karte.add(new Karta(9, Karta.DETELINA));
        karte.add(new Karta(10, Karta.DETELINA));
        karte.add(new Karta(11, Karta.DETELINA));
        karte.add(new Karta(12, Karta.DETELINA));
        karte.add(new Karta(13, Karta.DETELINA));
        karte.add(new Karta(14, Karta.DETELINA));


    }

    public Karta izbaciRandom() {
        int index = randomKarta.nextInt(karte.size());
        Karta karta = karte.get(index);
        //System.out.println("random katra " + karta + " izbacena");
        karte.remove(karta);
        return karta;
    }
}
