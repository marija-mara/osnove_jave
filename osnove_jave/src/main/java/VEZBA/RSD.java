package VEZBA;

public class RSD {
    public static void main(String[] args) {
        double rezultat=konvertuj(3,"RSD");
        System.out.println(rezultat);
    }
    static double konvertuj(double vrednostUEurima,String valuta){
        if(valuta.equals("RSD")){
            return vrednostUEurima*117.2113;
        }else if(valuta.equals("USD")){
            return vrednostUEurima*1.1821;
        } else if (valuta.equals("RUB")) {
            return vrednostUEurima * 89.2323;
        }else {
            return 0;
        }
    }
}
