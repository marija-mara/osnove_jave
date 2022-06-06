package p05_06_2022;

public class Kuca extends Objekat {
    private int brojClanova;

    public Kuca(String ulicaIbroj, int povrsinaObjekta, int zona, int brojClanova) {
        super(ulicaIbroj, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez() {
        return koefZaPorez() * povrsinaObjekta;
    }

    @Override
    public void stampaj() {
        System.out.println("Ulica i broj: " + this.ulicaIbroj);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Porez: " + porez());
    }
}
