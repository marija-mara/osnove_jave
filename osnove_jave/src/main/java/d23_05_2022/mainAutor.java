package d23_05_2022;

public class mainAutor {
    public static void main(String[] args) {
        Autor mara = new Autor("Marija", "jankovic");
        Autor vlada = new Autor("Vlada", "M");

        Knjiga knjiga = new Knjiga(741, "kuvar", 2000, vlada);
        Knjiga k = new Knjiga(552, "bela griva", 1955, mara);
        mara.stampaj();
        k.stampaj();
        knjiga.stampaj();
    }
}
