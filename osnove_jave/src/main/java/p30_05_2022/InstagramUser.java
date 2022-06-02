package p30_05_2022;

public class InstagramUser {
    private String username;
    private String punoIme;
    private String email;

    public InstagramUser(String username, String punoIme, String email) {
        this.username = username;
        this.punoIme = punoIme;
        this.email = email;
    }

    public InstagramUser() {
    }

    public String getUsername() {
        return username;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getEmail() {
        return email;
    }
}
