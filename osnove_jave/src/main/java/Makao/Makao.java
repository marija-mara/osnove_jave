package Makao;

import java.util.ArrayList;

public class Makao {

    private static final int BROJ_IGRACA = 4;
    Spil spil = new Spil();

    public Makao(Spil spil) {
        this.spil = spil;
    }

    ArrayList<Igrac> igraci = new ArrayList<Igrac>();
    ArrayList<Karta> odigraneKarte = new ArrayList<Karta>();

    private int getIndexIgraca() {
        return indexIgraca;
    }

    int indexIgraca = 0;

    public void pristupiStolu(Igrac ig) {
        igraci.add(ig);
    }

    public void podeliKarte() {
        for (int i = 0; i < igraci.size(); i++) {
            for (int j = 0; j < 6; j++) {
                igraci.get(i).dodajKartu(spil.izbaciRandom());
            }
        }
        // probati 3 po 3
    }

    public void sledeci() {
        // indexIgraca = (indexIgraca + 1) % BROJ_IGRACA ;
        if (indexIgraca == 3) {
            indexIgraca = 0;
        } else indexIgraca++;
    }

    public void stampaj() {
        for (int i = 0; i < igraci.size(); i++) {
            if (getIndexIgraca() == i) System.out.println("..........................................................");
            igraci.get(i).stampaj();
            System.out.println();
            if (getIndexIgraca() == i) System.out.println("**********************************************************");

        }

        if (odigraneKarte.size() > 0) {
            System.out.print("Zadnja karta na stolu je: ");
            odigraneKarte.get(odigraneKarte.size() - 1).stampaj();
            System.out.println();
        }
    }

    public boolean DaLiJeKrajIgre() {
        for (int i = 0; i < igraci.size(); i++) {
            if (igraci.get(i).getNizKarata().size() == 0)
                return true;
        }
        return false;
    }

    public Igrac VratiPobednika() {
        for (int i = 0; i < igraci.size(); i++) {
            if (igraci.get(i).getNizKarata().size() == 0)
                return igraci.get(i);
        }
        return null;
    }

    public void izvuciKartu() {
        igraci.get(getIndexIgraca()).dodajKartu(spil.izbaciRandom());
    }

    public void odigrajKartu(int broj, String znak) {
        Igrac igrac = igraci.get(getIndexIgraca());

        if (!igrac.daLiPostojiKarta(broj, znak)) {
            System.out.println("Igrac nema trazenu kartu");
            return;
        }
        Karta poslednjaOdigrana = odigraneKarte.get(odigraneKarte.size()-1);
        Karta novaKarta = null;
        if (poslednjaOdigrana.getBroj() == broj ||
            poslednjaOdigrana.getZnak().equals(znak))
        {
            novaKarta = igrac.odigrajKartu(broj, znak);
        }

        if (novaKarta == null) {
            System.out.println("Nije moguce odigrati kartu");
            return;
        }
        odigraneKarte.add(novaKarta);

        if (broj == 7) {

        } else if (broj == 8) {
            indexIgraca++;
        } else if (novaKarta.getBroj() == 1 || novaKarta.getBroj() == 11) {
            indexIgraca--;
        } else if (novaKarta.getBroj() == 2 &&
                novaKarta.getZnak().equals(Karta.DETELINA)) {
            int trenutiIgrac = getIndexIgraca();
            int prethodniIgrac;
            if (trenutiIgrac == 0) {
                prethodniIgrac = BROJ_IGRACA - 1;
            } else {
                prethodniIgrac = getIndexIgraca() - 1;
            }

            for (int i = 0; i < 4; i++) {
                igraci.get(prethodniIgrac).dodajKartu(spil.izbaciRandom());
            }

        }
        sledeci();
    }

    public void preseciSpil() {
        odigraneKarte.add(spil.izbaciRandom());
    }
}
