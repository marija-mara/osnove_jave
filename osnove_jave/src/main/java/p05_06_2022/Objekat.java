package p05_06_2022;

public abstract class Objekat {
    protected String ulicaIbroj;
    protected int povrsinaObjekta;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String ulicaIbroj, int povrsinaObjekta, int zona) {
        this.ulicaIbroj = ulicaIbroj;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getUlicaIbroj() {
        return ulicaIbroj;
    }

    public void setUlicaIbroj(String ulicaIbroj) {
        this.ulicaIbroj = ulicaIbroj;
    }

    public int getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(int povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koefZaPorez() {
        if (zona == 1) {
            return 1.4;
        } else if (zona == 2) {
            return 1.1;
        } else
            return 1.05;
    }

    public abstract double porez();

    public abstract void stampaj();

}
