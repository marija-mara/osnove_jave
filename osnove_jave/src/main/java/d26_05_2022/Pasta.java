package d26_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Pasta {
    Scanner s = new Scanner(System.in);
    private ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();

    public Pasta() {
    }

    public void dodajSastojak(Sastojak s) {
        nizSastojaka.add(s);
    }

    public double cenaPaste() {
        double suma = 0;
        for (int i = 0; i < nizSastojaka.size(); i++) {
            suma += nizSastojaka.get(i).getCena();
        }
        return suma;
    }

    public void stampa() {
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < nizSastojaka.size(); i++) {
            nizSastojaka.get(i).stampa();
        }
        System.out.println("Cena paste je: " + cenaPaste());
    }

    public void obrisiSastojak(String naziv){
        int index = 0;

        for (int i = 0; i < nizSastojaka.size(); i++) {
            if (nizSastojaka.get(i).getNaziv() == naziv)
            {
                index = i;
            }
        }

        nizSastojaka.remove(index);
    }
}
