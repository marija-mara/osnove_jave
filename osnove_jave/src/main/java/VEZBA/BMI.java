package VEZBA;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite tezinu osobe u (kg) :");
        int kg=s.nextInt();
        System.out.print("Unesite visinu osobe (m): ");
        double visina=s.nextDouble();
        double vrednostBmi=kg/(visina*visina);
        String kategorija="";
        if(vrednostBmi< 18.5){
            kategorija="Neuhranjenost";
        } else if (vrednostBmi>=18.5 && vrednostBmi <=24.99) {
            kategorija="Normalna tezina";

        }else if (vrednostBmi>=25 && vrednostBmi <=29.99) {
            kategorija="Prekomerna tezina";

        }else if(vrednostBmi>=30) {
            kategorija="Gojaznost";
        }

        System.out.println(vrednostBmi);
        System.out.println("Kategorija je " + kategorija);
    }
}
