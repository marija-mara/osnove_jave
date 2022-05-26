package p24_05_2022;
//Kreirati klasu Korisnik koja ima:
//ime i prezime
//tip licence (basic/pro/premium)
//konstruktore. Po difoltu korisnik ima basic licencu.
//gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//ako je uplata 100, postavlja licencu na “pro”
//ako je uplata 150, postavlja licencu na “premium”
//Metoda kao parametar prima vrednost uplate $100 ili $150
//metodu ponisti pretplatu koja postavlja licencu na basic
//metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//ako je basic, vraca 40min
//ako je pro, vraca 240min
//ako je  premium, vraca 1440min
//metodu za stampu koja stampa u formatu:
//ime i prezime
public class Korisnik {
    private String imeIprezime;
    private String tipLicence;

    public Korisnik(String imeIprezime)
    {
        this.tipLicence="basic";
        this.imeIprezime=imeIprezime;
    }
    public String getImeIprezime(){
        return this.imeIprezime;
    }
    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime=imeIprezime;
    }
    public String getTipLicence(){
        return this.tipLicence;
    }
    public void pretplata(int uplata){
        if(uplata==100) {
            this.tipLicence="pro";
        } else if (uplata==150) {
            this.tipLicence="premium";
        }
    }
    public void ponistiPretplatu(){
        this.tipLicence="basic";
    }
    public double maxDuzinaPoziva(){
        if(tipLicence.equals("basic")){
            return 40;
        } else if (tipLicence.equals("pro")) {
            return 240;
        } else if (tipLicence.equals("premium")) {
            return 1440;
        }
        return -1;
    }
    public void stampa(){
        System.out.println("ime i prezime: " + imeIprezime);
    }

}
