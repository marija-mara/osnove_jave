package d30_05_2022;

public class Ispit {
    private String predmet;
    private int ocena;
    private String profesor;

    public Ispit() {
    }

    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean daLiJePolozio(int ocena){
        return getOcena() > 6;
    }
    //metodu koja stampa ispit u formatu:
    //(naziv predmeta) - (profesor) - (ocena)
    public void stampaj(){
        System.out.println("(" + getPredmet() + ") - (" + getProfesor() + ") - (" + getOcena() );
    }
}
