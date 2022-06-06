package p03_06_2022;

public class IcePoint extends Proizvod {
    private String ukus;
    private boolean malaPorcija;

    public IcePoint() {
    }

    public String getUkus() {
        return ukus;
    }

    public void setUkus(String ukus) {
        this.ukus = ukus;
    }

    public boolean isMalaPorcija() {
        return malaPorcija;
    }

    public void setMalaPorcija(boolean malaPorcija) {
        this.malaPorcija = malaPorcija;
    }

    public IcePoint(String ukus, boolean malaPorcija) {
        this.ukus = ukus;
        this.malaPorcija = malaPorcija;
    }

    @Override
    public double ukupnaCena() {
//        double cena = 0;
//        if (malaPorcija) {
//            cena = cenaSastojaka() + 100;
//        } else {
//            cena = cenaSastojaka() + 130;
//        }
//        return cena;
        return this.malaPorcija ? this.cenaSastojaka() + 100 : this.cenaSastojaka() + 130;
        // return (uslov) ? vr1 : vr2
     }

    @Override
    public void stampaj() {
        System.out.println("Sladoled sa ukusom:" + this.ukus);
        if (malaPorcija) {
            System.out.println("Mala porcija sladoleda");
        } else {
            System.out.println("Velika porcija sladoleda");
        }
        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }
        System.out.println("Cena je: " + ukupnaCena());
    }
}
