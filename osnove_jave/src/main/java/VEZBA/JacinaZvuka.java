package VEZBA;
//Napisati program koji simulira korigovanje jacine zvuka na jutjubu.
//        Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video,
//        je 75%. Korisnik
//        unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
//        ● up - akcija povecava jacinu zvuka za 10%
//        ● down - akcija smanjuje jacinu zvuka za 10%
//        ● mute - akcije postavlja jacinu zvuka na 0%
//● unmute - akcija jacinu zvuka vraca na vrednost koja je bila pre mute akcije samo ako
//je prethodna akcija bila mute, u suprotnom vraca na podrazumevanu vrednost od
//75%.
//        Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju
//        programa ispisati jacinu zvuka.

import java.util.Scanner;

public class JacinaZvuka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String akcija = "";
        String prethodnaAkcija = "";
        int volume = 75;
        int prethodniZvuk = 0;
        while (!akcija.equals("PLAY")) {
            prethodnaAkcija = akcija;
            System.out.print("Akcija: ");
            akcija = s.next();
            if (akcija.equals("up")) {
                volume += 10;
                if (volume > 100) {
                    volume = 100;
                }
                prethodniZvuk=volume;
            } else if (akcija.equals("down")) {
                volume -= 10;
                if (volume < 0) {
                    volume = 0;
                }
                prethodniZvuk=volume;
            } else if (akcija.equals("mute")) {
                volume = 0;


            } else if (akcija.equals("unmute")) {

                if (prethodnaAkcija.equals("mute")) {
                     volume=prethodniZvuk;
                }else{
                    volume = 75;
                }
            }
            System.out.println("Jacina zvuka je: " + volume + "%");

        }
        System.out.println("Jacina zvuka je: " + volume + "%");

    }
}
