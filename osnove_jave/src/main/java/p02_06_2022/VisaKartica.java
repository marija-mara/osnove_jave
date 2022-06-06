package p02_06_2022;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(int suma,String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    private double racunajProviziju(double iznos) {
        double provizija = iznos * 0.018;
        if (provizija < 4) {
            return 4;
        }
        return provizija;
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        this.suma = this.suma - iznos - this.racunajProviziju(iznos);
    }

    @Override
    public void stampaj() {
        System.out.println("Visa Card");
        System.out.print(this.mesec + "/" + this.godina + ", ");
        System.out.println("$" + this.suma + ", " + this.brojKartice);
    }
}
