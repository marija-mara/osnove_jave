package TestJava2;

public class InstagramLocationAddOn extends InstagramAddOn {
    private String nazivLokacije;

    public InstagramLocationAddOn(int id, int x, int y,
                                  int sirinaDodatka, int visinaDodatka,
                                  String nazivLokacije) {
        super(id, x, y, sirinaDodatka, visinaDodatka);
        this.nazivLokacije = nazivLokacije;
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public int minimalnaSirinaDodatka() {
        return 100;
    }

    @Override
    public int minimalnaVisinaDodatka() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.getX() + ", " + this.getY()
        + "] (" + this.getVisinaDodatka() + ", " + this.getSirinaDodatka() + ") L " + this.nazivLokacije);
    }
}
