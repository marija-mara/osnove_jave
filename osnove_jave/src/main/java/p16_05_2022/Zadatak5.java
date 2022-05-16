package p16_05_2022;
//Napisati metodu stampajApsolutnuVrednost,
// koja stampa apsolutnu vrednost   prosledjene vrednosti.
public class Zadatak5 {
    public static void main(String[] args) {
        stampajApsulutnuVr(-8);
        stampajApsulutnuVr(-100);
    }
    static void stampajApsulutnuVr(int x){
        if(x<0){
            x=x*(-1);
        }
        System.out.println("Apsulutna vrednost je: " + x);
    }
}
