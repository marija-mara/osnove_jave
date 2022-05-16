package p16_05_2022;

//Napisati metodu koja stampa zvezdicu sa razmakom.
// U glavnom programu je potrebno odstampati sledecu sliku:
//*  *  *
//*  *
//*
public class Zadatak3 {
    public static void main(String[] args) {
        stampamZvezdicu();
        stampamZvezdicu();
        stampamZvezdicu();
        System.out.println();
        stampamZvezdicu();
        stampamZvezdicu();
        System.out.println();
        stampamZvezdicu();
    }

    static void stampamZvezdicu() {
        System.out.print(" * ");
    }
}
