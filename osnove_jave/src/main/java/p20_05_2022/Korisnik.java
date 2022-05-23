package p20_05_2022;

public class Korisnik {
    public String ime;
    public String prezime;
    public int godine;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Korisnik(String ime) {
        this.ime = ime;
    }
}
