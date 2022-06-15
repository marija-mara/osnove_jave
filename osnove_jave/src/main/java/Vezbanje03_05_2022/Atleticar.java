package Vezbanje03_05_2022;

public abstract class Atleticar {
    private String punoIme;
    protected double rezultat;

    public abstract boolean boljiPrvi(Atleticar a);

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }

    //atleticar.daLijebolj(atleticar2)
    //this.               atleticar2.
    public void stampaj() {
        System.out.println("ime i prezime: " + punoIme + ", rezultat " + rezultat);
    }
}
