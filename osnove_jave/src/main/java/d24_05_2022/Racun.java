package d24_05_2022;

public class Racun {
    private String brRacuna;
    private String imeIprezime;
    private double stanje;

    public Racun() {

    }

    public Racun(String brRacuna, String imeIprezime, int stanje) {
        this.brRacuna = brRacuna;
        this.imeIprezime = imeIprezime;
        this.stanje = stanje;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public double getStanje() {
        return stanje;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public boolean promeniStanje(double iznos) {
        double novoStanje = stanje + iznos;

        if (novoStanje < 0) {
            return false;
        }

        stanje = novoStanje;
        return true;
    }

    public void stampa() {
        System.out.println(imeIprezime + " - " + brRacuna);
        System.out.println("Stanje na racunu je: " + stanje + "rsd");

    }
}
