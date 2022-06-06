package p05_06_2022;

public class Zgrada extends Objekat {
    private int brojStanova;

    public Zgrada(String ulicaIbroj, int povrsinaObjekta, int zona, int brojStanova) {
        super(ulicaIbroj, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return koefZaPorez() * povrsinaObjekta * brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Ulica i broj: " + this.ulicaIbroj);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Porez: " + porez() );
    }
}
