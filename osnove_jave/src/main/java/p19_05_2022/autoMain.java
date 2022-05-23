package p19_05_2022;

public class autoMain {
    public static void main(String[] args) {

        Auto fica = new Auto();
        fica.imeIprezime = "Marija Jankovic";
        fica.markaAuta = "bmw";
        fica.brVrata = 5;
        fica.potrosnaNa100km = 10;
        fica.trenutnaBrzina = 55;
//        fica.stampaj();
        fica.brojRegistracije = "-898--9989";
        fica.klimaJeUkljucena = true;
        fica.doKadaJeRegMesec = 10;
        fica.kubikaza = 2000;
        fica.godinaProizvodnje=1954;
fica.kapRez=50;
fica.trKolGor=3;

        fica.dodajGas();
        fica.dodajGas();
        fica.dodajGas();
        fica.dodajGas();
        System.out.println(fica.trenutnaBrzina);
        fica.koci();
        System.out.println(fica.trenutnaBrzina);
        double x = fica.potrosnjaAuta();
        System.out.println(x);
        if (fica.prekoracio(90)) {
            System.out.println("kazna je :" + fica.kazna(90));
        }
         if (fica.oldtajmer()) {
             System.out.println("auto je oldtajmer");
         }

         if(fica.isteklaReg(7)) {
             System.out.println("registracija istekla");
         }

        System.out.println("cena registracije je: " + fica.cenaReg());



    }
}
