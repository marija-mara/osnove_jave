package v02_05_2022;

public class VideoPlayer {
    protected double duzinaVidea;
    protected double trenutnoVremeVidea;
    protected int jacinaZvuka;
    protected int kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea,
                       int jacinaZvuka, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public void stampaj() {
        System.out.println("trenutno vreme videa: " + this.trenutnoVremeVidea);
        System.out.println("jacina zuvka: " + this.jacinaZvuka);
        System.out.println("kvalitet: " + this.kvalitet);
    }
}
