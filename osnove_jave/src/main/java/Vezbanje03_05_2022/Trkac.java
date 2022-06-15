package Vezbanje03_05_2022;

public class Trkac extends Atleticar{

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean boljiPrvi(Atleticar a) {
        if(this.rezultat < a.rezultat){
            return true;
        }
        else return false;
    }
}
