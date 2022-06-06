package p02_06_2022;

public class StudentMaster extends Student {
    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    public StudentMaster() {
    }

    public StudentMaster(String punoIme, int brIndexa, int godina) {
        super(punoIme, brIndexa, godina);
    }

    @Override
    public boolean naBudzetu() {
        return this.godina < 2;
    }
}
