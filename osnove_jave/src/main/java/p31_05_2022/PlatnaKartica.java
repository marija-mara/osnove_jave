package p31_05_2022;

public class PlatnaKartica {
    protected int suma;
    protected String brKartice;
    protected int godVazenja;
    protected int mesVazenja;

    public PlatnaKartica(int suma, String brKartice, int godVazenja, int mesVazenja) {
        this.suma = suma;
        this.brKartice = brKartice;
        this.godVazenja = godVazenja;
        this.mesVazenja = mesVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public int getGodVazenja() {
        return godVazenja;
    }

    public int getMesVazenja() {
        return mesVazenja;
    }

    public void dodajSredstva(int vrednost) {
        this.suma += vrednost;
    }

    public void izvrsiTransakciju(int vredost) {
        this.suma -= vredost;
    }

    public void stampaj() {
        System.out.println(this.brKartice + ", " + mesVazenja + "/" + this.godVazenja + ", " + this.suma + "$");
    }
}
