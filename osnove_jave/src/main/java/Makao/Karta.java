package Makao;

public class Karta {

    public static final String LIST = "^";
    public static final String DETELINA = "***";
    public static final String KOCKA = "<>";
    public static final String SRCE = "<3";

    private int broj;
    private String znak;

    public Karta(int broj, String znak) {
        this.broj = broj;
        this.znak = znak;
    }

    public int getBroj() {
        return broj;
    }

    public String getZnak() {
        return znak;
    }

    public void stampaj() {
        System.out.print("[ ");

//        if (broj > 10) {
//            if (broj == 11) {
//                System.out.print("A");
//            } else if (broj == 12) {
//                System.out.print("J");
//            } else if (broj == 13) {
//                System.out.print("Q");
//            } else
//                System.out.print("K");
//        } else {
//            System.out.print(this.broj + " ");
//        }

//        if (znak.equals("srce")) {
//            System.out.print("<3");
//        } else if (znak.equals("List")) {
//            System.out.print("^");
//        } else if (znak.equals("detelina")) {
//            System.out.print("***");
//        } else if (znak.equals("kocka")) {
//            System.out.print("<>");
//        }

        if (broj > 10)
        {
            switch (broj) {
                case 11 -> System.out.print("A ");
                case 12 -> System.out.print("J ");
                case 13 -> System.out.print("Q ");
                case 14 -> System.out.print("K ");
            }
        }
        else {
            System.out.print(broj + " ");
        }

        System.out.print(znak);

        System.out.print(" ]");
    }

    public boolean daLijeMogucePoklopiti(int broj, String znak) {
        if (this.znak.equals(znak) || this.broj == broj) {
            return true;
        } else {
            return false;
        }
    }
}
