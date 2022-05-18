package TestJava;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite major verziju instalirane aplikacije: ");
        int major = s.nextInt();
        System.out.print("Unesite minor verziju instalirane aplikacije: ");
        int minor = s.nextInt();
        System.out.print("Na racunaru je instalirana verzija : " + major + "." + minor);
        System.out.println();
        System.out.print("Unesite major verziju najnovije aplikacije: ");
        int majorN = s.nextInt();
        System.out.print("Unesite minor verziju najnovije aplikacije: ");
        int minorN = s.nextInt();
        System.out.println("Najnovija verzija je " + majorN + "." + minorN);

        if (majorN > major || (major == majorN && minor < minorN)) {
            System.out.println("Notifikacija :Nova verzija aplikacije je dostupna za instalaciju.");
        } else {
            System.out.println("Notifikacija: Vec imate najnoviju verziju na svom racunaru.");
        }
    }
}
