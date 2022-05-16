package d13_05_2022;
//Napisati program koji ima niz brojeva duzine 10.
// Niz je fiksnih vrednosti (ne u nosi ih korisnik)
// a zatim se od korisnika ucitava pozicija elementa
// koji zeli da izbaci iz niza. Pre i nakon izbacivanja
// ispisati niz na ekranu. Ukoliko korisnik unese poziciju
// van opsega niza, ispisati poruku o gresci.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int n = 10;

        for (int i = 0; i < n; i++) {
            int nekiBroj = random.nextInt(10);
            niz.add(nekiBroj);
        }
        System.out.print("Niz je:");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(" ," + niz.get(i));
        }
        System.out.println();
        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();

        if (pozicija > n || pozicija < 0) {
            System.out.println("uneli ste nevalidnu poziciju!");
        } else {
            for (int i = pozicija; i < niz.size() - 1; i++) {
                niz.set(i, niz.get(i + 1));

            }
            n--;
            System.out.print("Niz nakon brisanja je:");
            for (int i = 0; i < n; i++) {
                System.out.print(" ," + niz.get(i));
            }
        }

    }
}
