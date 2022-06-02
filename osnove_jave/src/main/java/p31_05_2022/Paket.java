package p31_05_2022;

public class Paket {
    protected String nazivPaketa;
    protected String korisnik;
    protected int mesecnaCena;
    protected int ugovornaObaveza;
    protected double brzinaInternetaUpload;
    protected double brzinaInternetaDownload;

    public Paket(String nazivPaketa, String korisnik, int mesecnaCena,
                 int ugovornaObaveza, double brzinaInternetaUpload,
                 double brzinaInternetaDownload) {
        this.nazivPaketa = nazivPaketa;
        this.korisnik = korisnik;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.brzinaInternetaUpload = brzinaInternetaUpload;
        this.brzinaInternetaDownload = brzinaInternetaDownload;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public void setMesecnaCena(int mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public int getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public double getBrzinaInternetaUpload() {
        return brzinaInternetaUpload;
    }

    public double getBrzinaInternetaDownload() {
        return brzinaInternetaDownload;
    }

    //metodu produzi ugovor koja produzava ugovor za 12 meseci
    public void produziUgovor() {
        this.ugovornaObaveza = ugovornaObaveza + 12;
    }

    public int brojMeseci() {
        return 0;
    }

    public void stampaj() {
        System.out.println("Ime i prezime: " + korisnik);
        System.out.println("Naziv paketa: " + nazivPaketa + "brzina: "
                + brzinaInternetaDownload + "/" + brzinaInternetaUpload + "-" + ugovornaObaveza);
        System.out.println("Cena: " + mesecnaCena);
    }
}
