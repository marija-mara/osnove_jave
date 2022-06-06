package d03_06_2022;

public class main {
    public static void main(String[] args) {
        Korpa k = new Korpa();
        StaklenaAmbalaza pivo = new StaklenaAmbalaza("55-44",
                "pivo",40,70,40,
                false,35);
        Tetrapak sok = new Tetrapak("22-00","sok",
                20,35,true,15);
        k.dodajAmbalazu(pivo);
        k.dodajAmbalazu(sok);
        SuperKartica m = new SuperKartica("741","Ja",10);
        //k.ukupnaCenaKorpe(m);
        pivo.stampaj();
        sok.stampaj();
        m.stampaj();
        System.out.println(k.ukupnaCenaKorpe(m));

    }
}
