package d26_05_2022;

import java.util.ArrayList;

//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//privatnu metodu koja vraca broj reakcija odredjenog tipa
// (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2
public class facebookPost {
    private String imeAutora;
    private String teksObjave;
    private ArrayList<Reakcija> nizReakcija = new ArrayList<Reakcija>();

    public facebookPost(String imeAutora, String teksObjave) {
        this.imeAutora = imeAutora;
        this.teksObjave = teksObjave;
    }

    public facebookPost() {
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public String getTeksObjave() {
        return teksObjave;
    }

    public void reaguj(Reakcija r) {
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (nizReakcija.get(i).getImeIprezime().equals(r.getImeIprezime())) {
                nizReakcija.remove(r); // i

            }

        }
        nizReakcija.add(r);
    }

    private int brojReakcija(Reakcija.ReakcijaEnum tipReakcije) {
        int pom = 0;
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (nizReakcija.get(i).getReakcija().equals(tipReakcije)) {
                pom++;
            }
        }
        return pom;
    }

    public void stampaj() {
        System.out.println(imeAutora);
        System.out.println(teksObjave);
        System.out.print("Smajli " + brojReakcija(Reakcija.ReakcijaEnum.SMILE));
        System.out.print(" | ");
        System.out.print("Like " + brojReakcija(Reakcija.ReakcijaEnum.LIKE));
        System.out.print(" | ");
        System.out.println("Srce " + brojReakcija(Reakcija.ReakcijaEnum.SRCE));

    }

}
