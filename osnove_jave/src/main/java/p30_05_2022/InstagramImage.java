package p30_05_2022;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InsagramTag> nizTagova = new ArrayList<>();
    private String dimenzijaSlike;
    private String putanja;

    public InstagramImage(String dimenzijaSlike, String putanja) {
        this.dimenzijaSlike = dimenzijaSlike;
        this.putanja = putanja;
    }

    public String getDimenzijaSlike() {
        return dimenzijaSlike;
    }

    public String getPutanja() {
        return putanja;
    }

    public void dodajTag(InsagramTag tag){
        this.nizTagova.add(tag);
    }
}
