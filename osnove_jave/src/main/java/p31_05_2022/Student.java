package p31_05_2022;

public class Student extends Osoba {
    protected int brIndexa;
    protected int dug;

    public Student(String punoIme, String jmbg, int brIndexa, int dug) {
        super(punoIme, jmbg);
        this.brIndexa = brIndexa;
        this.dug = dug;

    }

    public int uplataSkolarine(int uplata) {
        return this.dug - uplata;


    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj indexa: " + this.brIndexa + " Dug: " + this.dug);
        System.out.println();
    }
}
