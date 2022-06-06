package p02_06_2022;

public class Pravougaonik extends Figura {
    protected int a;
    protected int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Pravougaonik() {
    }

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a*b;
    }

    @Override
    public double obim() {
        return a+a+b+b;
    }
}
