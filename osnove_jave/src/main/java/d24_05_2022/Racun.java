package d24_05_2022;

public class Racun {
    private String brRacuna;
    private String imeIprezime;
    private int stanje;

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

    public int getStanje() {
        return stanje;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public void menjaStanje(int iznos) {
        int novoStanje = stanje - iznos;
        stanje =  novoStanje < 0 ? stanje : novoStanje;
    }

    public void stampa() {
        System.out.println("ime i prezime: " + imeIprezime + " - " + brRacuna);
        System.out.println("Stanje na racunu je: " + stanje + "rsd");
    }
}
