package p24_05_2022;

public class mainProdaja {
    public static void main(String[] args) {
        FizickoLIce ja = new FizickoLIce("MarijaJ",
                544, 2020, true);
        FizickoLIce ti = new FizickoLIce("Xman",
                412, 845, false);
        ja.stampaj();
        ti.stampaj();

        Ugovor ugovor1 = new Ugovor("25.02", ja,
                ti, 5000, "dj din 123");
        ugovor1.procenatZarade();
        ugovor1.zaradaAgencije();
        ugovor1.stampa();
    }
}
