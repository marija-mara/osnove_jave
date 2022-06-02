package d31_05_2022;

public class Osoba {
    protected String punoIme;
    protected int jmbg;
    protected int godRodj;

    public Osoba() {
    }

    public Osoba(String punoIme, int jmbg, int godRodj) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodj = godRodj;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public int getJmbg() {
        return jmbg;
    }

    public int getGodRodj() {
        return godRodj;
    }
    public void stampaj(){
        System.out.println(this.punoIme + "," + this.jmbg + ", " + this.godRodj);
    }
}
