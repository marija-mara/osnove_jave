package p05_06_2022;

public class Lokal extends Objekat{
    public Lokal(String ulicaIbroj, int povrsinaObjekta, int zona) {
        super(ulicaIbroj, povrsinaObjekta, zona);
    }

    @Override
    public double porez() {
        return koefZaPorez() * povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Ulica i broj: " + this.ulicaIbroj);
        System.out.println("Povrsina objekta: " + this.povrsinaObjekta);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + porez());
    }
}
