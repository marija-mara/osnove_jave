package VEZBA;

import java.util.Scanner;

//Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
//zaredom.Na kraju programa ispisati sumu unetih brojeva
public class DveNuleZaredom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int brojac = 0;
        int suma = 0;

        while (brojac != 2) {
            System.out.print("unesi broj:");
            int a = s.nextInt();
            if (a == 0) {
                brojac++;
            } else {
                brojac = 0;
            }
            suma+=a;
        }
        System.out.print("Suma je : " + suma);
    }
}
