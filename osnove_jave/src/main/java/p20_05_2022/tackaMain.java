package p20_05_2022;

public class tackaMain {
    public static void main(String[] args) {
        Tacka m = new Tacka();
        m.x = 2;
        m.y = 0;
        m.stampaj();

        Tacka u = new Tacka(4, 5);
        u.stampaj();
    }
}
