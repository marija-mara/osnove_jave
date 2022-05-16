package p16_05_2022;

import java.util.Scanner;

//Napisati metodu koja stampa N zvezdica u istom redu.
// Broj zvezdica je odredjen parametrom N.
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("unesi n: ");
        int n=s.nextInt();
        zvezda(n);
    }
    static void zvezda(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }
}
