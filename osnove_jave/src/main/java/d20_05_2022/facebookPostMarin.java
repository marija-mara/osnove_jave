package d20_05_2022;

public class facebookPostMarin {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost();
        post1.imeIprezime = "Marija Jankovic";
        post1.postavljamKodKoga = "Saska Mica";
        post1.brojLajkova = 10;
        post1.brojDeljenja = 6;
        post1.tekst = "pozdravljam te";
        post1.like();
        post1.like();
        post1.like();
        post1.share();
        post1.print();

        FacebookPost post2=new FacebookPost();
        post2.imeIprezime="Nemanja Neca";
        post2.postavljamKodKoga="Mara Maric";
        post2.brojLajkova=0;
        post2.brojDeljenja=0;
        post2.tekst="poljubac";
        post2.dislike();
        post2.share();
        post2.print();

    }
}
