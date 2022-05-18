package VEZBA;

//Napisati metodu koja vraca obrnuti string od onog koji je prosledjen.
public class ObrnutiIspis {
    public static void main(String[] args) {
        {
            String str = obrni("izmenila");
            System.out.println(str);
        }
    }
    static String obrni(String rec){
        String obrnutaRec = "";
        for (int i = rec.length() - 1; i >= 0; i--) {
           obrnutaRec += (rec.charAt(i));//spojila string
        }
        return obrnutaRec;
    }

}
