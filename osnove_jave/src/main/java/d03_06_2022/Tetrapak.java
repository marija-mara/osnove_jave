package d03_06_2022;

public class Tetrapak extends Ambalaza {
    private boolean mozeReciklaza;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double neto,
                    double bruto, boolean mozeReciklaza, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.mozeReciklaza = mozeReciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isMozeReciklaza() {
        return mozeReciklaza;
    }

    public void setMozeReciklaza(boolean mozeReciklaza) {
        this.mozeReciklaza = mozeReciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (mozeReciklaza) {
            return tezinaPakovanja() * 1.5 + osnovnaCena;
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Ambalaza - " + naziv);
        System.out.println("Barkod: " + barkod);
        System.out.println("Tezina: " + tezinaPakovanja());
        System.out.println("Cena: " + cenaArtikla());
        if (mozeReciklaza) {
            System.out.println("Moze se reciklirati");
        } else {
            System.out.println("Nemoze se reciklirati");
        }
    }
}
