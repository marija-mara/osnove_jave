package TestJava;

public class Zadatak4 {
    public static void main(String[] args) {
        double rezultat = konvertij(3.5, "cm");
        System.out.println("3.5m je " + rezultat + "cm");
        rezultat = konvertij(3.5, "dm");
        System.out.println("3.5m je " + rezultat + "dm");
        rezultat = konvertij(3.5, "km");
        System.out.println("3.5m je " + rezultat + "km");
    }

    static double konvertij(double vrednostUMetrima, String jedinica) {
        if (jedinica.equals("cm")) {
            return vrednostUMetrima * 100;
        } else if (jedinica.equals("dm")) {
            return vrednostUMetrima * 10;
        } else if (jedinica.equals("km")) {
            return vrednostUMetrima / 1000;

        } else {
            return -1;
        }

    }
}
