package p02_06_2022;

public class main {
    public static void main(String[] args) {
        StudentOsnovnih s1 = new StudentOsnovnih("Milan", 16113, 2);
        StudentMaster sm = new StudentMaster("Vlada", 2020, 3);
        s1.stampaj();
        sm.stampaj();

    }
}
