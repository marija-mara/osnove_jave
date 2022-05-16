package p16_05_2022;

public class Zad10 {
    public static void main(String[] args) {
        double res=konvertuj(3,("RSD"));
        System.out.println(res);
    }
    static double konvertuj(double VrUeur,String valuta){
        if(valuta.equals("RSD")){
            return VrUeur * 117;
        }else if (valuta.equals("USA")){
            return VrUeur * 1.1821;

        }else {
            return 0;
        }
    }
}
