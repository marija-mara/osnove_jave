package p31_05_2022;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(int suma, String brKartice, int godVazenja, int mesVazenja) {
        super(suma, brKartice, godVazenja, mesVazenja);
    }

    @Override
    public void izvrsiTransakciju(int vredost) {
        super.izvrsiTransakciju(vredost);
        int provizija = vredost * 1000 / 15;
    }

    public void naplatiOdrzavanje() {
        this.suma -= 2;
    }

    @Override
    public void stampaj() {

        System.out.println("Master Card : ");
        super.stampaj();
    }
}
