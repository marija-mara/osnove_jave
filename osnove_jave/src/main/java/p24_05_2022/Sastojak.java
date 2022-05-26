package p24_05_2022;

//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
public class Sastojak {
    private String naziv;
    private double cena;

    public Sastojak() {
    }

    public Sastojak(String naziv,double cena) {
        this.naziv = naziv;
        this.cena=cena;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void stampaj() {
        System.out.println("Sastojak " + this.naziv + ", " + this.cena + ".din");
    }
}
