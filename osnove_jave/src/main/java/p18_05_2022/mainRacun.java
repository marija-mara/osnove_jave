package p18_05_2022;

public class mainRacun {
    public static void main(String[] args) {
        Racun r = new Racun();
        r.brojRacuna="840-23932-323";
        r.ime="Mara";
        r.prezime="Ja";
        r.stanje=1;

        Racun z= new Racun();
        z.brojRacuna="840-23932-323";
        z.ime="Neca";
        z.prezime="Ti";
        z.stanje=10;

        System.out.println("Broj racuna: " + r.brojRacuna);
        System.out.println("Ime: " + r.ime);
        System.out.println("Prezime: " + r.prezime);
        System.out.println("Stanje: " + r.stanje);
        
        System.out.println();

        System.out.println("Broj racuna: " + z.brojRacuna);
        System.out.println("Ime: " + z.ime);
        System.out.println("Prezime: " + z.prezime);
        System.out.println("Stanje: " + z.stanje);



    }
}
