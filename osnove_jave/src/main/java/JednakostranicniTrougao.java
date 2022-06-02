public class JednakostranicniTrougao extends Figura{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public JednakostranicniTrougao() {
    }

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        double rez= (a * a) * 1.73205 / 4;
        return rez;
    }

    @Override
    public double obim() {
        return a+a+a;
    }
}
