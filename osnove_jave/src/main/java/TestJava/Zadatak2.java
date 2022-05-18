package TestJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<Integer>();
        int n = 5;
        Random random = new Random();
        for (int i = 0; i < n * n; i++) {
            int nekiBroj = random.nextInt(10);
            niz.add(nekiBroj);

        }
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + " ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.print("Unesi kolonu za sumiranje: ");
        int kolona = s.nextInt();
        int suma = 0;
        int korak = 5;
        for (int i = kolona; i < niz.size(); i += korak) {
            suma += niz.get(i);
        }
        System.out.println("Suma je: " + suma);
    }
}
