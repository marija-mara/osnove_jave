package p03_06_2022;

import java.util.ArrayList;

public class Kasa {

    ArrayList<Sastojak> dodaci = new ArrayList<>();
    ArrayList<Proizvod> proizvodi = new ArrayList<>();

    public void dodajProizvod(Proizvod p) {
        proizvodi.add(p);
    }

    public Kasa() {
        dodaci.add(new Sastojak("luk", 60));
        dodaci.add(new Sastojak("piletina", 100));
        dodaci.add(new Sastojak("junetina", 150));
        dodaci.add(new Sastojak("prsuta", 90));
        dodaci.add(new Sastojak("jaja", 10));
        dodaci.add(new Sastojak("cokolada", 30));
        dodaci.add(new Sastojak("jagoda", 40));
        dodaci.add(new Sastojak("vanila", 20));
    }

    public Sastojak nadjiSastojak(String nazivSastojka) {
        Sastojak trazeni = null;
        for (int i = 0; i < dodaci.size(); i++) {
            if (dodaci.get(i).naziv.equals(nazivSastojka)) {
                return this.dodaci.get(i);
            }
        }
        return trazeni;
    }
}
