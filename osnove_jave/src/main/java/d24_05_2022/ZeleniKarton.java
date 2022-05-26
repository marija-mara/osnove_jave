package d24_05_2022;

public class ZeleniKarton {
    private String imeIprezime;
    private int brIndexa;
    private String nazivPredmeta;
    private String imeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIprezime,
                        int brIndexa, String nazivPredmeta,
                        String imeProfesora, int ocena) {
        this.imeIprezime = imeIprezime;
        this.brIndexa = brIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozio(int ocena) {
        return this.ocena > 5 ? true : false;
    }

    public void stampaj() {
        System.out.println("Naziv predmeta: " + nazivPredmeta + " - " + ocena);
        System.out.println("Student: " + imeIprezime + ", " + brIndexa);
        System.out.println("Profesor: " + imeProfesora);

    }
}
