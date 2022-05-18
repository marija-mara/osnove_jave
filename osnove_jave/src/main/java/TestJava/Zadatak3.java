package TestJava;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite lozinku: ");
            String lozinka = s.next();
            if (lozinka.length() > 7 && (lozinka.contains("@") || lozinka.contains("#"))) {
                System.out.println("Lozinka je validna.");
                isValid = true;
            } else {
                System.out.println("Lozinka nije validna.");
            }
        }
    }
}
