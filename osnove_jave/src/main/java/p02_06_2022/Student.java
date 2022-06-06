package p02_06_2022;

public abstract class Student {
    protected String punoIme;
    protected int brIndexa;
    protected int godina;

    public Student() {
    }

    public Student(String punoIme, int brIndexa, int godina) {
        this.punoIme = punoIme;
        this.brIndexa = brIndexa;
        this.godina = godina;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public int getGodina() {
        return godina;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public abstract int cenaSkolarine();

    public abstract boolean naBudzetu();

    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.brIndexa + ", " + this.godina);
        System.out.println("Finasiranje: ");
        if (this.naBudzetu()) {
            System.out.println("Budzet");
        } else
            System.out.println("Samofinansirajuci");

        System.out.println("Cena skolarine: " + cenaSkolarine());
    }
}
