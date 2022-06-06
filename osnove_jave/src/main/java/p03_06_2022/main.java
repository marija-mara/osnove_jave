package p03_06_2022;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        Proizvod vanilaIce = new IcePoint("vanila", true);
        Proizvod cokoladaIce = new IcePoint("cokolada", false);
        Proizvod marga = new Pica(150);
        Proizvod ves = new Pica(200);
        //kada je tipa proizvod a ne icepoint ne mogu da pristupim .setTip(sladoled)
        vanilaIce.dodajSastojak(new Sastojak("mrvice", 200));
        vanilaIce.dodajSastojak(new Sastojak("plazma", 50));
        vanilaIce.stampaj();

        marga.dodajSastojak(new Sastojak("masline", 40));

        proizvodi.add(vanilaIce);
        proizvodi.add(cokoladaIce);
        proizvodi.add(marga);
        proizvodi.add(ves);
        Kasa kasa = new Kasa();
        kasa.dodajProizvod(vanilaIce);
        kasa.dodajProizvod(cokoladaIce);
        kasa.nadjiSastojak("vanila");

        double cenaPorudzbine = 0;
        for (int i = 0; i < proizvodi.size(); i++) {
            cenaPorudzbine = proizvodi.get(i).ukupnaCena();
        }
        System.out.println("Cena porudzbine je: " + cenaPorudzbine);
    }
}
