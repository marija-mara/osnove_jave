package p31_05_2022;

public class mainFax {
    public static void main(String[] args) {
        Student s1 = new Student("Marija", "230299774520", 16113, 4000);
        Student s2 = new Student("Ana", "410254784520", 8888, 9720);

        Profesor p1 = new Profesor("Vlada", "145216454345", "oop", 5000);
        Profesor p2 = new Profesor("Milan", "20141452145", "oop2", 7000);
        s1.uplataSkolarine(4000);
        s1.stampaj();
        s2.stampaj();

        p1.povecajPlatu(10);
        p1.stampaj();



    }
}
