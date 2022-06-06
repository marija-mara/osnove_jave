package Vezbanje03_05_2022;

import java.util.ArrayList;

public class Chart {
    ArrayList<Integer> nizBrojeva = new ArrayList<>();

    public String getNazivGrafika() {
        return nazivGrafika;
    }

    public void setNazivGrafika(String nazivGrafika) {
        this.nazivGrafika = nazivGrafika;
    }

    private String nazivGrafika;
    public void dodajBroj(int broj){
        nizBrojeva.add(broj);
    }
    public void stampaj(){
        for (int prag = 100; prag >= 0; prag-=10) { //kolone
            System.out.print(prag);
            for (int j = 0; j <nizBrojeva.size(); j++) { //redovi
                System.out.print("\t");
                if (nizBrojeva.get(j) >= prag) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("\n" + nazivGrafika);
    }

}
