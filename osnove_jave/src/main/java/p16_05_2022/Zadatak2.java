package p16_05_2022;
//Napisati dve metode, jedna metoda sluzi za stampanje imena
// a druga sluzi za stampanje prezimena. U glavnom programu
// pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
public class Zadatak2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ime();
            System.out.print(" ");
            prezime();
            System.out.println(" ");

        }
    }

    static void prezime() {
        System.out.print("Jankovic");

    }

    static void ime() {
        System.out.print("Marija ");

    }
}
