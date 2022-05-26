package p24_05_2022;

//U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija
public class main {
    public static void main(String[] args) {
        Korisnik h = new Korisnik("Marija j");
        Korisnik g = new Korisnik("Nemanja m");

        ZoomCall call = new ZoomCall("www.zoom.com", "555", h);

        call.setGuest(g);
        call.pokreniPoziv();

    }
}
