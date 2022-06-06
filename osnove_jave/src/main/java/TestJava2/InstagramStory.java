package TestJava2;

import java.util.ArrayList;

public class InstagramStory {
    InstagramUser autor;
    private String linkSwipeUp;
    private String linkDoSlike;


    public InstagramStory(InstagramUser autor, String linkSwipeUp, String linkDoSlike) {
        this.autor = autor;
        this.linkSwipeUp = linkSwipeUp;
        this.linkDoSlike = linkDoSlike;
    }

    ArrayList<InstagramAddOn> nizDodataka = new ArrayList<>();
    ArrayList<InstagramUser> pregledali = new ArrayList<>();

    public InstagramUser getAutor() {
        return autor;
    }

    public String getLinkSwipeUp() {
        return linkSwipeUp;
    }

    public String getLinkDoSlike() {
        return linkDoSlike;
    }

    public ArrayList<InstagramAddOn> getNizDodataka() {
        return nizDodataka;
    }

    public ArrayList<InstagramUser> getPregledali() {
        return pregledali;
    }

    public void setLinkSwipeUp(String linkSwipeUp) {
        this.linkSwipeUp = linkSwipeUp;
    }

    public void dodajDodatak(InstagramAddOn a) {
        nizDodataka.add(a);
    }

    public void brisanje(int id) {
        for (int i = 0; i < nizDodataka.size(); i++) {
            if (nizDodataka.get(i).getId() == id) {
                this.nizDodataka.remove(i);
            }
        }
    }
    private boolean pregledaoStory(String username){
        for (int i = 0; i < pregledali.size(); i++) {
            if(pregledali.get(i).getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    public void pregledajStory(InstagramUser korisnik){
        if(!pregledaoStory(korisnik.getUsername())){
            pregledali.add(korisnik);
        }
    }
    public void postaviStori(){
        autor.stampaj();
        System.out.println("Story: ");
        System.out.println("Image: " + this.linkDoSlike);
        for (int i = 0; i < nizDodataka.size(); i++) {
            nizDodataka.get(i).stampaj();
        }
        if(linkSwipeUp!=null){
            System.out.println("<<< swipe up >>>" );
            System.out.println(linkSwipeUp);
        }
    }
    public int brojPregleda(){
        return pregledali.size();
    }
    public void stampajPreglede(){
        System.out.println("Viewers " + brojPregleda());
        for (int i = 0; i < pregledali.size(); i++) {
            pregledali.get(i).stampaj();
        }
    }
}
