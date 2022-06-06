package p05_06_2022;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        PoreskaUprava p = new PoreskaUprava();
//        Kuca k = new Kuca("vkv 5", 70, 3, 2);
//        Lokal l = new Lokal("djDin 11", 110, 1);
//        Zgrada z = new Zgrada("bul 87", 5000, 2, 40);
//
//        p.dodajObj(k);
//        p.dodajObj(l);
//        p.dodajObj(z);
//        p.stampaj();
//        p.ukupanPorez();
//        System.out.println("Ukupan porez je: " + p.ukupanPorez());
//
        //najveci u nizu    p.najveciporez().stampaj();

        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(2);
        niz.add(3);
        niz.add(8);
        niz.add(9);
        niz.add(1);
        niz.add(0);
        niz.add(6);

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(" " + niz.get(i));
        }
        int max = niz.get(0);
        for (int i = 1; i < niz.size(); i++) {
            if (niz.get(i) > max) {
                max = niz.get(i);
            }
        }
        System.out.println( " Najveci je: " + max);


    }
}
