package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji uci korisnika da kaze “Molim te”.
// Program od korisnika ucitava zahteve koje treba da izvrsi ali
// jedino reaguje ukoliko korisnik lepo zamoli ( u zahtevu unese
// “Molim te”). Ukoliko korisnik unese zahtev u vidu naredjivanja,
// program ne reaguje na takve zahteve tj. nista ne ispisuje,
// a ukoliko korisnik zamoli tada program ispisuje “Dogovoreno!”.
// Program radi dok korisnik ne unese “Hvala!”.
// Na kraju programa ispisati “Cao”
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<String> niz = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite zahtev: ");
        String zahtev = s.nextLine();
        String molba = "molim te";


        while (!zahtev.equalsIgnoreCase("hvala")) {
            if (zahtev.toLowerCase().contains(molba)) { // MolIM tE
                System.out.println("Dogovoreno! ");
            }
            System.out.print("Unesite zahtev: ");
            zahtev = s.nextLine();
        }
        System.out.println("cao :D");
    }

}
