package p16_05_2022;

//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
// za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
// U glavnom programu pozvati nekoliko puta funkciju sa razlicitim
// prosledjenim vrednostima.
public class Zadatak4 {
    public static void main(String[] args) {
        operacija(10, 5);
        operacija(20, 5);

    }

    static void operacija(int x, int y) {

        int proizvod = 1;
        proizvod = x * y;
        System.out.println("Proizvod je: " + proizvod);

        int kolicnik = 0;
        kolicnik = x / y;
        System.out.println("Kolicnik je: " + kolicnik);

        int suma = 0;
        suma = x + y;
        System.out.println("Suma je: " + suma);

        int razlika = 0;
        razlika = x - y;
        System.out.println("Razlika je: " + razlika);

        System.out.println();

    }
}
