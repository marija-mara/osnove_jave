package d03_06_2022;

public class SuperKartica {
    private String brojKartice;
    private String punoIme;
    private double popust;

    public SuperKartica() {
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public SuperKartica(String brojKartice, String punoIme, double popust) {
        this.brojKartice = brojKartice;
        this.punoIme = punoIme;
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println("Br kartice: " + brojKartice + ",  " + punoIme);
    }
}
