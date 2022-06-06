package Vezbanje03_05_2022;

public class main {
    public static void main(String[] args) {
        Chart c = new Chart();
        c.setNazivGrafika("Moj grafik");
        c.dodajBroj(15);
        c.dodajBroj(19);
        c.dodajBroj(20);
        c.dodajBroj(10);
        c.dodajBroj(75);
        c.dodajBroj(95);
        c.dodajBroj(100);

        c.stampaj();
    }
}
