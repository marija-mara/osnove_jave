package p20_05_2022;

public class Radnik {
    public int jmbg;
    public String imeIprezime;
    public int brDece;
    public int stepenSSpreme;
    public int radniStaz;
    public double zarada;

    public Radnik(int jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String imeIprezime, int brDece, int stepenSSpreme, int radniStaz, int zarada) {
        this.imeIprezime = imeIprezime;
        this.brDece = brDece;
        this.stepenSSpreme = stepenSSpreme;
        this.radniStaz = radniStaz;
        this.zarada = zarada;
    }

    public double minuli() {
        if (radniStaz < 10) {
            return zarada * 0.05;
        } else if (radniStaz >= 10 && radniStaz <= 20) {
            return zarada * 0.075;
        } else if (radniStaz > 20) {
            return zarada * 0.1;
        }
        return 0;
    }

    public void stampaj() {
        System.out.println(minuli());
    }

    public double koefSlozenosti() {
        if (this.stepenSSpreme == 1) {
            return 1.03;
        } else if (this.stepenSSpreme == 2) {
            return 1.65;
        } else if (this.stepenSSpreme == 3) {
            return 2.0;
        } else if (this.stepenSSpreme == 4) {
            return 2.27;
        } else if (this.stepenSSpreme == 5) {
            return 2.88;
        } else if (this.stepenSSpreme == 6) {
            return 3.09;
        } else if (this.stepenSSpreme == 7) {
            return 3.40;
        } else if (this.stepenSSpreme == 8) {
            return 4.12;
        }
        return -1;
    }

    public double plata() {
        return 2500 * (koefSlozenosti() + minuli()) + 10000;
    }

    public boolean mozeKredit() {
        if (zarada > 50000) {
            return true;
        }
        return false;
    }

    public int slobodniDani() {
       int slobodni = 22;
       // return 22+(this.brDece)*2;
        for (int i = 1; i < this.brDece; i++) {
            slobodni += 2;
        }
        return 22;
    }
}
