package d30_05_2022;

import java.util.ArrayList;

public class Student {
    private int brIndexa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student(int brIndexa, String punoIme, String tipStudija) {
        this.brIndexa = brIndexa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit(Ispit i) {
        this.ispiti.add(i);
    }

//    public double porsek(){
//        if(Ispit.getOcena())
//    }

}
