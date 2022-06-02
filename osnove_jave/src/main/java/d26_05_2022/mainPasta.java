package d26_05_2022;

public class mainPasta {
    public static void main(String[] args) {
        Pasta p = new Pasta();
        p.dodajSastojak(new Sastojak("beli luk", 100));
        p.dodajSastojak(new Sastojak("piletina", 400));
        p.dodajSastojak(new Sastojak("penne", 45));
        p.cenaPaste();
        p.obrisiSastojak("beli luk");
        p.stampa();
    }
}
