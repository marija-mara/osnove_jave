package p16_05_2022;

//Napisati metodu koja stampa N zvezdica u istom redu.
// Broj zvezdica je odredjen parametrom N.
public class Zadatak6 {
    public static void main(String[] args) {
        zvezda(6);
    }
    static void zvezda(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }
}
