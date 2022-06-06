package TestJava2;

public class InstagramUser {
    private String username;
    private String punoIme;

    public InstagramUser(String username) {
        this.username = username;
    }

    public InstagramUser(String username, String punoIme) {
        this.username = username;
        this.punoIme = punoIme;
    }

    public String getUsername() {
        return username;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void stampaj() {
        System.out.println("@" + this.username + "\t" + this.punoIme);
    }
    public String linkDoProfila(){
        String link = "https://www.instagram.com/" + username + "/";
        return link;
    }
}
