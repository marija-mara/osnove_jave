package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();
        ZeleniKarton z = new ZeleniKarton("mara", 16113,
                "oop", "vlada", 10);
        z.stampaj();

        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesi ime studenta: ");
            String ime = s.next();
            System.out.print("Unesi profesora: ");
            String profaIme = s.next();
            System.out.print("unesi ocenu: ");
            int ocena = s.nextInt();
            System.out.print("unesi predmet: ");
            String predmet = s.next();
            System.out.print("Broj indexa: ");
            int brIndexa = s.nextInt();

            ZeleniKarton x = new ZeleniKarton(ime, brIndexa, predmet, profaIme, ocena);
            zeleniKartoni.add(x);

        }

    }
}
