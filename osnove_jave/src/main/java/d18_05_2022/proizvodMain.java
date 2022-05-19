package d18_05_2022;

public class proizvodMain {

    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        p.cena = 23.2;
        p.naziv = "boca";
        p.tezina = 23.55555;
        p.stampaj();
        p.year = 1996;
        p.pasvord="itbootcamp123";
        p.email="mara@bot";
        p.login("milan.com", "nijedobra");

        if(p.login("mara@bot", "Mara")) {
            System.out.println("dobro je ");
        }else {
            System.out.println("nije dobro");
        }
        int age = p.age(2022);
        boolean uspeo=p.login("mara@bot", "ffa");
        System.out.println(uspeo);
        System.out.println("trenutno godina: " + age);

        if (p.daLiJepunoletan(2022) == true) {
            System.out.println("punoletan.");
        } else {
            System.out.println("nije punoletan");
        }

        Proizvod v = new Proizvod();
        v.cena = 10;
        v.naziv = "kesa";
        v.tezina = 52.36;
        v.stampaj();
    }

}
