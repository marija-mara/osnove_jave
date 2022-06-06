package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean moraKaucija;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barkod, String naziv, double neto,
                            double bruto, double kaucija, boolean moraKaucija,
                            int osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.moraKaucija = moraKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isMoraKaucija() {
        return moraKaucija;
    }

    public void setMoraKaucija(boolean moraKaucija) {
        this.moraKaucija = moraKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (moraKaucija) {
            return osnovnaCena * 1.2 + kaucija;
        } else return osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Ambalaza - " + naziv);
        System.out.println("Barkod: " + barkod);
        System.out.println("Kaucija: " + kaucija);
        System.out.println("Cena : " + this.cenaArtikla());
        if (moraKaucija) {
            System.out.println("Mora kaucija");
        } else {
            System.out.println("Nemora kaucija");
        }
    }
}
