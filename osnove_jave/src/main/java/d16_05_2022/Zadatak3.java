package d16_05_2022;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja
// i da li je aktivan kao parametre metode.
public class Zadatak3 {
    public static void main(String[] args) {
        podaci(255, "Marija", "Jankovic", 1997, true);
    }

    static void podaci(int jmbg, String ime, String prezime, int godinaRodj, boolean aktivan) {
        System.out.print("JMBG: " + jmbg + "\n");
        System.out.print("Ime: " + ime + "\n");
        System.out.print("Prezime: " + prezime + "\n");
        System.out.print("God.rodj: " + godinaRodj + "\n");
        System.out.println("Aktivan: " + aktivan + "\n");
    }
}
