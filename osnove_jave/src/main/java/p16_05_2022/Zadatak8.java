package p16_05_2022;

//Napisati metodu koja proverava da li je trougao pravougli.
// Metoda prima stranice trougla i hipotenuzu trougla.
// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

public class Zadatak8 {
    public static void main(String[] args) {
        boolean pravougli = pravougli(3,4,5);
        System.out.println(pravougli);
    }
    static boolean pravougli(int a, int b, int c ){
        if(a*a+b*b==c*c) {
            System.out.println("pravougli je ");
            return true;

        }
        else {
            System.out.println("nije pravougli");
            return false;
        }
    }
}
