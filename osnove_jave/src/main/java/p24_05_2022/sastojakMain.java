package p24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class sastojakMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();
        System.out.print("unesite n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesi naziv: ");
            String naziv = s.next();
            System.out.print("Unesi cenu: ");
            double cena = s.nextDouble();

            Sastojak x = new Sastojak(naziv, cena);
            nizSastojaka.add(x);
        }
        double suma = 0;
        for (int i = 0; i < nizSastojaka.size(); i++) {
            suma = suma + nizSastojaka.get(i).getCena();
        }
        System.out.println("SUma sastojaka je " + suma);
    }
}
