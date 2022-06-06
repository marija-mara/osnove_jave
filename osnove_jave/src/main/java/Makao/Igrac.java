package Makao;

import java.util.ArrayList;

public class Igrac {
    private String punoIme;
    ArrayList<Karta> nizKarata = new ArrayList<>();

    public ArrayList<Karta> getNizKarata() {
        return nizKarata;
    }

    public Igrac(String punoIme) {
        this.punoIme = punoIme;
    }

    public void dodajKartu(Karta k) {
        nizKarata.add(k);
    }

    public boolean daLiPostojiKarta(int broj, String znak) {
        for (int i = 0; i < nizKarata.size(); i++) {
            if (nizKarata.get(i).getBroj() == broj && nizKarata.get(i).getZnak().equals(znak)) {
                return true;
            }
        }
        return false;
    }

    public Karta odigrajKartu(int broj, String znak) {
        if (daLiPostojiKarta(broj, znak)) {
            Karta trenutnaKarta = null;
            for (int i = 0; i < nizKarata.size(); i++) {
                trenutnaKarta = nizKarata.get(i);
                if (trenutnaKarta.getBroj() == broj && trenutnaKarta.getZnak().equals(znak)) {
                    return nizKarata.remove(i);
                }
            }
        }
        return null;
    }

    public void stampaj(){
        System.out.println(punoIme);
        for (int i = 0; i < nizKarata.size(); i++) {
            nizKarata.get(i).stampaj();
            System.out.print("  ");
        }
    }
}
