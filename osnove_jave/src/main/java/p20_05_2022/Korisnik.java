package p20_05_2022;

public class Korisnik {
    public String ime;
    public String prezime;
    public int year;
    public String email;
    public String pasvord;

    public Korisnik() {
    }

    public String getIme() {
        return this.ime;
    }

    public Korisnik(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.year = godine;
    }

    public Korisnik(String ime) {
        this.ime = ime;
    }

    public int age(int trenutnaGodina) {
        return trenutnaGodina - this.year;
    }


    public boolean login(String emailSalogina, String pasvorSaLogina) {
        if (email.equals(emailSalogina) && pasvord.equals(pasvorSaLogina)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean daLiJepunoletan(int currentYear) {
        int age = currentYear - this.year;
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
