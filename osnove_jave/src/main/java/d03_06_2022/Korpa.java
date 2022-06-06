package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza a){
        ambalaze.add(a);
    }
    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).barkod == barkod) {
                ambalaze.remove(ambalaze.get(i));
            }
        }
    }

    private double cenaAmbalazaSaPopustom(double popust) {
        double suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).cenaArtikla();
        }
        return suma - popust;
    }
    public double ukupnaCenaKorpe(SuperKartica s) {
       return cenaAmbalazaSaPopustom(s.getPopust());
    }
}
