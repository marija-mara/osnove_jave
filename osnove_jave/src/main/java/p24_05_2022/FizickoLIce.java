package p24_05_2022;

public class FizickoLIce {
    private String punoIme;
    private int brLicne;
    private int jmbg;
    public boolean kupovala;

    public FizickoLIce() {

    }

    public FizickoLIce(String punoIme, int brLicne, int jmbg, boolean kupovala) {
        this.punoIme = punoIme;
        this.brLicne = brLicne;
        this.jmbg = jmbg;
        this.kupovala = kupovala;
    }

    public String getPunoIme() {
        return punoIme;
    }
    public void setBrLicne(){
        this.brLicne=brLicne;
    }

    public int getBrLicne() {
        return brLicne;
    }

    public int getJmbg() {
        return jmbg;
    }

    public boolean isKupovala() {
        return kupovala;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setKupovala(boolean kupovala) {
        this.kupovala = kupovala;
    }

    public void stampaj() {

        System.out.println(String.format("ime: %s,broj licne ksrte %s",
                this.punoIme, this.brLicne));
    }
}
