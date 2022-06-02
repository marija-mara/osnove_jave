package p31_05_2022;

public class Profesor extends Osoba {
    private String predmet;
    private double plata;

    public Profesor(String punoIme, String jmbg, String predmet, double plata) {
        super(punoIme, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPlatu(double procenat) {
        this.plata = this.plata * (this.plata + procenat) / 100;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("predmet: " + predmet + "  plata: " + plata);

    }
}
