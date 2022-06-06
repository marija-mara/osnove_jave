package p03_06_2022;

public class Sastojak {
    protected String naziv;
    protected double cenaSastojka;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaSastojka() {
        return cenaSastojka;
    }

    public void setCenaSastojka(double cenaSastojka) {
        this.cenaSastojka = cenaSastojka;
    }

    public Sastojak() {
    }

    public Sastojak(String naziv, double cenaSastojka) {
        this.naziv = naziv;
        this.cenaSastojka = cenaSastojka;
    }

    public void stampaj() {
        System.out.println("(" + this.naziv + ")  (" + this.cenaSastojka + ")");
    }
}
