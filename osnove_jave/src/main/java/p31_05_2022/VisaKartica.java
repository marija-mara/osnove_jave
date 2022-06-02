package p31_05_2022;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica( String brKartice, int godVazenja, int mesVazenja, String ovlascenoLice) {
        super(100, brKartice, godVazenja, mesVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(int vredost) {
        super.izvrsiTransakciju(vredost);
        int provizija = vredost * 1000 / 18;
    }

    @Override
    public void stampaj() {

        System.out.println("visaCard: ");
        super.stampaj();
    }
}
