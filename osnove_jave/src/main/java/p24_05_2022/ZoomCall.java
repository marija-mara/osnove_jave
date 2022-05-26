package p24_05_2022;

//	Kreirati klasu ZoomCall koja ima:
//            link za poziv
//            password
//            korisnika koji je host
//            korisnika koji je guest
//            gettere za sve atribute
//            setter samo za guest-a
//            metodu pokreni poziv koja stampa podatke u formatu:
//            Zoom Call: url
//            Password: password
//            Host: ime i prezime
//            Guest: ime i prezime
//            Maksimalno trajanje poziva je (broj minuta)min
//            Maksimalno trajanje poziva se cita od korisnika koji je host!
//

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String link, String password, Korisnik host) {
        this.link = link;
        this.password = password;
        this.host = host;

    }

    private String getLink() {
        return this.link;
    }

    public String getPassword() {
        return this.password;
    }

    public Korisnik getHost() {
        return this.host;
    }

    public Korisnik getGuest() {
        return this.guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniPoziv() {
        System.out.println("zoomCall url: " + link);
        System.out.println("Password: " + password);
        System.out.println("Host: " + host.getImeIprezime());
        if(this.guest != null ){
            System.out.println("Guest je: " + guest.getImeIprezime());
        }
        System.out.println("Guest: " + guest.getImeIprezime());
        System.out.println("Maximalna duzina poziva je " + host.maxDuzinaPoziva() + "min");
    }
}
