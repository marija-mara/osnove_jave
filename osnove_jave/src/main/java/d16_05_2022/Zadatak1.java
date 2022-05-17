package d16_05_2022;
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena
// vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

public class Zadatak1 {
    public static void main(String[] args) {
        stampajVrednostZa10Vecu(12);
        stampajVrednostZa10Vecu(-5);
        stampajVrednostZa10Vecu(0);

    }
    static void stampajVrednostZa10Vecu(int a) {
        System.out.println(a+10);
    }
}
