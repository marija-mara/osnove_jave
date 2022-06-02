package p02_05_2022;

public class mainKartice {
    public static void main(String[] args) {
        VisaKartica visa = new VisaKartica( 120,"1234", 2019, 11, "Melanija Krstojevic");

        visa.dodajSredstva(200);
        visa.izvrsiTransakciju(150);
        visa.stampaj();

        MasterKartica master = new MasterKartica(2000, "5678", 2020, 5);
        master.dodajSredstva(100);
        master.izvrsiTransakciju(200);
        master.naplatiOdrzavanje();
        master.stampaj();

        // Vozilo a = new Auto();
        // Vozilo k = new Kamion();
        // Vozilo z = a;   z=k;
        //a. ---> samo metode iz osnovne, na primer ono sto je dodatno
        //u izvedenoj treba da se navede u konstruktoru.

        //vrednosti idu u konstruktoru, ne preko setera.
        //Vozilo x;   x=new Auto();   x=new Kamion();
        //polimorfizam: preko prom osnovne izvrsimo met izvedene

        // ArrayList<Vozilo> vozila= new ArrayList ----> niz referenci
        //koji moze da cuva razlicite objekte istog tipa.
        //vozila.add(new Auto());



        //pravi se promenljiva osnovne klase koja cuva referencu na objekat izvedene klase


    }
}
