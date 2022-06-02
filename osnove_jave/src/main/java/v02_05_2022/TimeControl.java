package v02_05_2022;

public class TimeControl extends Control {
    protected boolean pomeraj;

    public TimeControl() {
    }

    public TimeControl(boolean pomeraj) {
        this.pomeraj = pomeraj;
    }

    public boolean isPomeraj() {
        return pomeraj;
    }

    public void setPomeraj(boolean pomeraj) {
        this.pomeraj = pomeraj;
    }

    @Override
    public void izvsiAkciju(VideoPlayer v) {
        double buduce = v.getTrenutnoVremeVidea();
        if (pomeraj) {
            buduce = buduce + 15;
        } else {
            buduce = buduce - 15;
        }
        if (buduce > v.getDuzinaVidea()) {
            buduce = v.getDuzinaVidea();
        }
        if (buduce < 0) {
            buduce = 0;
        }
    }
}
