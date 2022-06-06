package p03_06_2022;

import java.util.ArrayList;

public abstract class Proizvod {
    protected ArrayList<Sastojak> sastojci = new ArrayList<>();

    public void dodajSastojak(Sastojak sastojak) {
        sastojci.add(sastojak);
    }

    public double cenaSastojaka() {
        int suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma += this.sastojci.get(i).getCenaSastojka();
        }
        return suma;
    }
    public abstract double ukupnaCena();
    public abstract void stampaj();

}
