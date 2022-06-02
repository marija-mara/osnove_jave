package p30_05_2022;

import java.util.ArrayList;

public class InsagramPost {
    private ArrayList<InstagramImage> nizSlika = new ArrayList<>();
    private String opis;

    public InsagramPost() {
    }

    public InsagramPost(String opis) {
        this.opis = opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void dodajSlik(InstagramImage slika) {
        this.nizSlika.add(slika);
    }
}
