package d02_03_2022;

import java.util.ArrayList;

public abstract class Radnik {
    protected String punoIme;

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    protected ArrayList<Sektor> sektori = new ArrayList<>();
    public abstract double vratiPlatuRadnika();
    public void zaposli(Sektor sektor){
        System.out.println("Radnik pocinje sa radom u sektoru: " + sektor );
    }


}
