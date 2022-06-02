package p31_05_2022;

public class mainBanka {
    public static void main(String[] args) {
        VisaKartica v1 = new VisaKartica( "145-841", 2020, 5, "Vlada");
        MasterKartica m1 = new MasterKartica(9000, "884-995", 2022, 10);

        v1.izvrsiTransakciju(10);
        v1.dodajSredstva(5000);
        v1.stampaj();

        m1.naplatiOdrzavanje();
        m1.stampaj();
    }
}
