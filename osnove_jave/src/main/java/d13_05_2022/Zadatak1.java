package d13_05_2022;
//Napisati program koji ima niz brojeva od 25 elemenata,
// koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
// (ne unosi ih korisnik) zatim korisnik unosi poziciju za
// koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog
// polja dodaju vrednosti elemenata iznad, ispod, sleve i
// sdesne strane tog elementa (Ukoliko ti elementi postoje,
// vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int n = 5;
        for (int i = 0; i < n * n; i++) {
            int nekiBroj = random.nextInt(10);
            niz.add(nekiBroj);
        }
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + " ,");
            if (i % n == n - 1) { //i%5 == 4
                System.out.println();
            }
        }

        System.out.print("Unesite poziciju izmedju 0 i " + (n*n-1) + " :");
        int pozicija = s.nextInt();
        int suma = niz.get(pozicija);

        //gornja ivica
        if (pozicija > n - 1) {
            suma += niz.get(pozicija - n);
        }

        //donja ivica
        if (pozicija < n * (n - 1)) {
            suma += niz.get(pozicija + n);
        }

        //leva ivica
        if (pozicija % n != 0) {
            suma += niz.get(pozicija - 1);
        }

        //desna ivica
        if (pozicija % n != n - 1) {
            suma += niz.get(pozicija + 1);
        }
        System.out.println("Suma je " + suma);
    }
}
