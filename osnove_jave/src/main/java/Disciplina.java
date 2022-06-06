import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;

    public Disciplina() {
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
    }

    protected ArrayList<Atleticar> atlete = new ArrayList<>();

    public void dodajAtletica(Atleticar atleticar) {
        atlete.add(atleticar);
    }

    public void diskvalifikuj(String imeAtleticara) {
        for (int i = 0; i < atlete.size(); i++) {
            if (this.atlete.get(i).getPunoIme().equals(imeAtleticara)) {
                this.atlete.remove(i);
            }
        }
    }

    private Atleticar najboljiRezultat() {
        Atleticar a = this.atlete.get(0);
        for (int i = 0; i < atlete.size(); i++) {
            if (this.atlete.get(i).boljiPrvi(a)) {
                a = this.atlete.get(i);
            }
        }
        return a;
    }

    public void stampajPobednika() {
        System.out.println("Pobednik je :");
        this.najboljiRezultat().stampaj();
    }

}
