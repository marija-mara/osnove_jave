package d18_05_2022;

public class proizvodMain {

    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        p.cena = 23.2;
        p.naziv = "boca";
        p.tezina = 23.55555;
        p.stampaj();

        Proizvod v = new Proizvod();
        v.cena = 10;
        v.naziv = "kesa";
        v.tezina = 52.36;
        v.stampaj();
    }

}
