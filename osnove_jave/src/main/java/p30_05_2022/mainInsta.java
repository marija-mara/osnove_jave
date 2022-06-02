package p30_05_2022;

public class mainInsta {
    public static void main(String[] args) {
        InstagramUser ja = new InstagramUser("marita",
                "marija j", "mara@gmail");

        InsagramTag tag = new InsagramTag("1", "1", "vlada");

        InstagramImage slika = new InstagramImage("1080x720",
                " instagram.com/korsnik-pera/profilna.jpg");

        InsagramPost post = new InsagramPost("neka dobra slika");
        slika.dodajTag(tag);
    }
}
