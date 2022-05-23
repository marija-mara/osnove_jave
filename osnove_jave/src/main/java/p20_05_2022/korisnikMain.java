package p20_05_2022;

public class korisnikMain {

    public static void main(String[] args) {
        Korisnik m = new Korisnik("mara", "jan", 25);
        //gde su ovi podaci iz zagrada gde se nalaze? brisu se nakon poziva konstruktora
        Korisnik u = new Korisnik("Marija");
        m.prezime = "Jankovic";
        System.out.println(u.ime + m.prezime);
//     preko def konstruktora
//        m.ime="Marija";
//        m.prezime= "Jankovic";
//        m.godine=20;
    }

}
