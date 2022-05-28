package d24_05_2022;

public class mainTransakcija {
    public static void main(String[] args) {
        Racun r1 = new Racun("251", "mara", 250);
        Racun r2 = new Racun("25541", "nera", 25550);

        Transakcija t1 = new Transakcija(84, r1, r2);
        t1.vrsimTransakciju(500);
        t1.stampa();
        System.out.println("************");

        Transakcija t2 = new Transakcija(84, r2, r1);
        t2.vrsimTransakciju(5000);
        t2.stampa();


    }
}
