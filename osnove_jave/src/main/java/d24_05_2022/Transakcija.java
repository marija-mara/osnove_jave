package d24_05_2022;

public class Transakcija {
    private int id;
    private Racun davaoc;
    private Racun primalac;

    public Transakcija() {
    }

    public Transakcija(int id, Racun davaoc, Racun primalac) {
        this.id = id;
        this.davaoc = davaoc;
        this.primalac = primalac;
    }

    public int getId() {
        return id;
    }

    public Racun getDavaoc() {
        return davaoc;
    }

    public void setDavaoc(Racun davaoc) {
        this.davaoc = davaoc;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private int provizija() {
        if (racun.suma < 4500) {
            return 45;
        } else if (prenos > 4500) {
            return 1;
        }
        return 0;
    }


}
