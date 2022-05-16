package p16_05_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a = 11;
//        int b = 10;
//        int x = suma(a, b);
//        // int z = s.nextInt();
//        System.out.println("suma a i b je : " + x );
//        int a=apsulutna(5);
//        System.out.println("aps je: " + a);

        String pIme = spojiImeIPr("Mara", "ja");
        System.out.println(pIme);

        boolean x= daLiSuJednakiBR(10,10);
        System.out.println(x);
    }

//    static int suma(int a, int b) {
//        int s = a + b;
//        return s;
//    }

//    static int apsulutna(int broj) {
//        if (broj < 0) {
//            return broj * -1;
//        } else {
//            return broj;
//        }
//    }

    static String spojiImeIPr(String ime, String prezime) {
        String punoIme = ime + " " + prezime;
        return punoIme;
    }

    static boolean daLiSuJednakiBR(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

}
