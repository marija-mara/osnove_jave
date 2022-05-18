package p18_05_2022;

import java.util.Scanner;

public class mainRacun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun r = new Racun();
        r.brojRacuna = "840-23932-323";
        r.ime = "Mara";
        r.prezime = "Ja";
        r.stanje = 1000;

        Racun z = new Racun();
        z.brojRacuna = "840-23932-323";
        z.ime = "Neca";
        z.prezime = "Ti";
        z.stanje = 200;

        System.out.println("Posiljaoc: " + r.ime + "," + r.brojRacuna + ",stanje:" + r.stanje);
        System.out.println("Primalac: " + z.ime + "," + z.brojRacuna + ",stanje:" + z.stanje);
        System.out.print("Unesite sumu za transakciju: ");

        int transakcija = s.nextInt();

        System.out.print("Stanje nakon transakcije: ");
        System.out.println("Posiljaoc: " + r.ime + "," + r.brojRacuna + ",stanje:" + (r.stanje -= transakcija));;
        System.out.println("Primalac: " + z.ime + "," + z.brojRacuna + ",stanje:" + (z.stanje += transakcija));
    }
}
