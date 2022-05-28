package d26_05_2022;

public class mainPasta {
    public static void main(String[] args) {
        Sastojak s1 = new Sastojak("so", 50);
        Sastojak s2 = new Sastojak("voda", 25);
        Sastojak s3 = new Sastojak("mleko", 75);

        Pasta p = new Pasta();

        p.dodajSastojak(s1);
        p.dodajSastojak(s2);
        p.dodajSastojak(s3);
        p.cenaPaste();

        p.stampa();
    }
}
