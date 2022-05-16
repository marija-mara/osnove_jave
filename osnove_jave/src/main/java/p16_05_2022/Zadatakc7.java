package p16_05_2022;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
// Metoda prima broj N i vraca ga sa negativnom vrednoscu.
public class Zadatakc7 {
    public static void main(String[] args) {
        int a = vratiSuprotno(-10);
        System.out.println(a);
    }

    static int vratiSuprotno(int n) {
        if (n < 0) {
            return n * -1;
        } else if (n > 0) {
            return n;
        }    return 0;

    }
}
