package p19_05_2022;

public class autoMain {
    public static void main(String[] args) {

        Auto fica = new Auto();
        fica.imeIprezime = "Marija Jankovic";
        fica.markaAuta = "bmw";
        fica.brVrata = 5;
        fica.potrosnaNa100km = 10;
        fica.trenutnaBrzina = 55;
        fica.stampaj();
        fica.brojRegistracije="-898--9989";
        fica.klimaJeUkljucena=true;

        fica.dodajGas();
        fica.dodajGas();
        fica.dodajGas();
        fica.dodajGas();
        System.out.println(fica.trenutnaBrzina);
        fica.koci();
        System.out.println(fica.trenutnaBrzina);
        double x= fica.potrosnjaAuta();
        System.out.println(x);



        if(fica.prekoracio(90)){
            System.out.println("kazna je :" + fica.kazna(90));
        }



//        boolean jeste=fica.prekoracio(50);
//        System.out.println("Da li je prekoracio: " + jeste );
//
//        int kazna = fica.kazna(50);
//        System.out.println("Kazna je: " + kazna);

//
//        Auto b = new Auto();
//        b.imeIprezime = "Milan i Vlada";
//        b.markaAuta = "svermirski";
//        b.brVrata = 100;
//        b.potrosnaNa100km = -5;
//        b.trenutnaBrzina = 30000;
//        b.stampaj();
    }
}
