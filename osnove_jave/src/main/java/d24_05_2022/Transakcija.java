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

    private double provizija(double transakcija) {
        if (transakcija < 4500) {
            return 45;
        } else if (transakcija > 4500) {
            return transakcija * 0.01;
        }
        return 0;
    }

    public void vrsimTransakciju(double vrednost) {
        if (davaoc.promeniStanje(-vrednost)) {
            primalac.promeniStanje(+vrednost);
        } else {
            System.out.println("Nedovoljno sredstava na racunu " + davaoc.getBrRacuna());
        }

    }

    public void stampa() {
        System.out.println("id " + id);
        System.out.print("Racuna sa: ");
        this.davaoc.stampa();
        System.out.print("Racun na: ");
        this.primalac.stampa();
    }

}
