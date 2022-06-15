package TestJava2;

public abstract class InstagramAddOn {
    private int id;
    private int x;
    private int y;
    private int sirinaDodatka;
    private int visinaDodatka;

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSirinaDodatka() {
        return sirinaDodatka;
    }

    public int getVisinaDodatka() {
        return visinaDodatka;
    }

    public InstagramAddOn(int id, int x, int y, int sirinaDodatka, int visinaDodatka) {
        this.id = id;
        this.x = x;
        this.y = y;
        if (minimalnaVisinaDodatka() < visinaDodatka ) {
            this.visinaDodatka=visinaDodatka ;
        } else this.visinaDodatka = minimalnaVisinaDodatka();

        if (minimalnaSirinaDodatka() < sirinaDodatka ) {
            this.sirinaDodatka = sirinaDodatka ;
        } else {
            this.sirinaDodatka = minimalnaSirinaDodatka();
        }

    }

    public abstract int minimalnaSirinaDodatka();

    public abstract int minimalnaVisinaDodatka();

    public void povecanjeDimenzija(int povecanjeSirine, int povecanjeVisine) {
        this.sirinaDodatka += povecanjeSirine;
        this.visinaDodatka += povecanjeVisine;
    }

    public void smanjenjeDimenzija(int smanjenjeSirine, int smanjenjeVisine) {
        if (minimalnaVisinaDodatka() < visinaDodatka - smanjenjeVisine) {
            visinaDodatka -= smanjenjeVisine;
        } else visinaDodatka = minimalnaVisinaDodatka();

        if (minimalnaSirinaDodatka() < sirinaDodatka - smanjenjeSirine) {
            sirinaDodatka -= smanjenjeSirine;
        } else {
            sirinaDodatka = minimalnaSirinaDodatka();
        }
    }

    public abstract void stampaj();
}
