package VEZBA;

import java.util.ArrayList;
import java.util.Scanner;

// Za potrebe loto igre na srecu, potrebno je napisati program
// koja ispisuje informaciju da li
//je odigrana loto kombinacija upravo dobitna kombinacija.
// Korisnik unosi dva niza oba duzine
//7, prvi niz predstavlja odigranu kombinaciju a drugi niz
// predstavlja izvucenu kombinaciju.
//Program na kraju ispisuje da li je dobitna kombinacija
public class Loto {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> odigrana=new ArrayList<>();
        ArrayList<Integer> dobitna=new ArrayList<>();
        int n=7;
       // System.out.print("odigrana: ");
        for (int i = 0; i < n; i++) {
            int a=s.nextInt();
            odigrana.add(a);

        }
        //System.out.print("izvucena: ");
        for (int i = 0; i < n; i++) {
                int b=s.nextInt();
                dobitna.add(b);
        }
            if (metoda(odigrana,dobitna))
            {
                System.out.println("Jeste dobitna kombinacija");
            }
            else
            {
                System.out.println("Nije dobitna kombinacija");
            }
    }
    static boolean metoda(ArrayList<Integer> odigrana,ArrayList<Integer> dobitna){
        boolean dobio = false;
        int n=7;
        int brojac=0;
        for (int i = 0; i < n; i++) {
            if (odigrana.get(i) == dobitna.get(i)){
                brojac++;
            }
        }
        if(brojac==n)
        {
            dobio=true;
        }
        return dobio;
    }
}
