package p03_06_2022;

public class Pica extends Proizvod {
    protected double cenaPodloge;

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public double getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double ukupnaCena() {
        return  this.cenaSastojaka() + cenaPodloge;
    }

    @Override
    public void stampaj() {
        System.out.println("Pica kosta: " + ukupnaCena());
    }
}
