package p24_05_2022;

public class Ugovor {
    private String datum;
    private FizickoLIce prodavac;
    private FizickoLIce kupac;
    public double cena;
    public String adresa;

    public Ugovor(String datum, FizickoLIce prodavac,
                  FizickoLIce kupac, double cena, String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public String getDatum() {
        return datum;
    }

    public FizickoLIce getProdavac() {
        return prodavac;
    }

    public FizickoLIce getKupac() {
        return kupac;
    }

    public double getCena() {
        return cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double procenatZarade() {
        return this.kupac.isKupovala() ? 0.02 : 0.03;
    }

    public double zaradaAgencije() {
        return 100 + this.cena * procenatZarade();
    }

    public void stampa() {
        System.out.println("Dana " + datum + ".god sklopljen je ugovor izmedju");
        System.out.println(prodavac.getPunoIme() + " i " + kupac.getPunoIme() + " o ");
        System.out.println("kupovini nekretnine " + this.adresa + "po ceni od " + this.cena);
        System.out.println("pri cemu je kupac u obavezi da agnciji isplati nocanu vrednost");
        System.out.println("u iznosu od " + zaradaAgencije());
    }
}
