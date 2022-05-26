package p20_05_2022;

public class korisnikMain {

    public static void main(String[] args) {
        Korisnik m = new Korisnik("mara", "jan", 25);
        //gde su ovi podaci iz zagrada gde se nalaze? brisu se nakon poziva konstruktora
        m.prezime = "Jankovic";

        String ime = m.getIme();
        System.out.println(m.getIme());
        m.pasvord = "itbootcamp123";
        m.email = "mara@bot";
        m.login("milan.com", "nijedobra");

        if (m.login("mara@bot", "Mara")) {
            System.out.println("dobro je ");
        } else {
            System.out.println("nije dobro");
        }
        int age = m.age(2022);
        boolean uspeo = m.login("mara@bot", "ffa");
        System.out.println(uspeo);
        System.out.println("trenutno godina: " + age);

        if (m.daLiJepunoletan(2022) == true) {
            System.out.println("punoletan.");
        } else {
            System.out.println("nije punoletan");
        }
//     preko def konstruktora
//        m.ime="Marija";
//        m.prezime= "Jankovic";
//        m.godine=20;
    }

}
