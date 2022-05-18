package p18_05_2022;

public class MainKorisnik {
    public static void main(String[] args) {

        // String =>null
        // int => 0
        // double => 0.0
        // float => 0.0
        // boolean => false

        Korisnik m=new Korisnik();
        m.ime="Marija";
        m.prezime="Jankovic";
        m.godine= 25;
        m.email="mara@gmail";

        System.out.println("ime: " + m.ime);
        System.out.println("prezime: " + m.prezime);
        System.out.println("god: " + m.godine);
        System.out.println("imejl: " + m.email);


        Korisnik d=new Korisnik();
        d.ime="Nemanja";
        d.prezime="Neca";
        d.godine= 28;
        d.email= "neca@gmail";


    }
}
