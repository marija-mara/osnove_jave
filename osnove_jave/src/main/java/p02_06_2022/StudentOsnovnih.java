package p02_06_2022;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih() {
    }

    public StudentOsnovnih(String punoIme, int brIndexa, int godina) {
        super(punoIme, brIndexa, godina);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        return this.godina < 5;
    }
}
