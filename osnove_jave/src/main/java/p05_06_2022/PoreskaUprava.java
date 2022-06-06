package p05_06_2022;

import java.util.ArrayList;

public class PoreskaUprava {
    private String grad;
    private ArrayList<Objekat> objekti = new ArrayList<>();

    public void dodajObj(Objekat o) {
        objekti.add(o);
    }

    public double ukupanPorez() {
        double suma = 0;
        for (int i = 0; i < objekti.size(); i++) {
            suma += objekti.get(i).porez();
        }
        return suma;
    }

    public void stampaj() {
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();
        }
    }

    public Objekat porezNajveci() {
//        double maxPorez = this.objekti.get(0).porez();
//        int pozicija = 0;
//        for (int i = 0; i < this.objekti.size(); i++) {
//            if (this.objekti.get(i).porez() > maxPorez) {
//                maxPorez = this.objekti.get(i).porez();
//                pozicija = i;
//            }
//        }
//        System.out.println(pozicija);
//        System.out.println(maxPorez);
//
//        return objekti.get(pozicija);

        Objekat najveci = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).porez() > najveci.porez()) {
                najveci = this.objekti.get(i);
            }
        }
        return najveci;
    }
}
