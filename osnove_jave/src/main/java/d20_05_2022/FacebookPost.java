package d20_05_2022;

public class FacebookPost {
    public String imeIprezime;
    public String postavljamKodKoga;
    public String tekst;
    public int brojLajkova;
    public int brojDeljenja;

    public FacebookPost() {

    }

    public FacebookPost(String imeIprezime, String postavljamKodKoga, String tekst) {
        this.imeIprezime = imeIprezime;
        this.postavljamKodKoga = postavljamKodKoga;
        this.tekst = tekst;
    }

    public void like() {
        brojLajkova += 1;
    }

    public void dislike() {
        if (brojLajkova > 0) {
            brojLajkova -= 1;
        }
    }

    public void share() {
        brojDeljenja += 1;
    }

    public void print() {
        System.out.println(imeIprezime + " >>> " + postavljamKodKoga);
        System.out.println(tekst);
        System.out.println("Likes  " + brojLajkova + " | " + "Shares  " + brojDeljenja);
        System.out.println();
    }

}
