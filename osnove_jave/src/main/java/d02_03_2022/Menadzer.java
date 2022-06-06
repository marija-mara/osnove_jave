package d02_03_2022;

public class Menadzer extends Radnik{
    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double vratiPlatuRadnika() {
        int suma=0;
        for (int i = 0; i < sektori.size(); i++) {
            suma+=sektori.get(i).plata;
        }
        return suma;
    }
}
