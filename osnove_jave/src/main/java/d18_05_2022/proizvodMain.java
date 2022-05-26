package d18_05_2022;

public class proizvodMain {

    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        p.cena = 230.2;
        p.naziv = "boca";
        p.tezina = 230.55555;

        p.povecajCenu(10);
        p.racunajPostarinu();
        System.out.println();
        p.stampaj();
        System.out.println("Postarina je " + p.racunajPostarinu());


        Proizvod v = new Proizvod();
        v.cena = 100;
        v.naziv = "kesa";
        v.tezina = 52.36;
        v.stampaj();
        System.out.println("Cena sa popustom je " + v.vratiCenuSaPopustom(30));
        System.out.println("Postarina je " + v.racunajPostarinu());
    }

}
