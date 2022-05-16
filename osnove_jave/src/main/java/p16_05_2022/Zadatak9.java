package p16_05_2022;

//Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
public class Zadatak9 {
    public static void main(String[] args) {
        int a = konvertuj("X");
        System.out.println(a);
    }

    static int konvertuj(String rimski) {
        if (rimski.equals("I")) {
            return 1;
        } else if (rimski.equals("II")) {
            return 2;
        } else if (rimski.equals("III")) {
            return 3;
        } else if (rimski.equals("IV")) {
            return 4;
        } else {
            return 0;
        }
    }
}