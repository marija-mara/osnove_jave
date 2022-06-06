package p02_06_2022;

import java.util.ArrayList;

public class mainFigure {
    public static void main(String[] args) {
        ArrayList<Figura> figure = new ArrayList<>();
        Figura t1 = new JednakostranicniTrougao(4);
        Figura t2 = new JednakostranicniTrougao(5);
        Figura p1 = new Pravougaonik(4, 6);
        Figura p2 = new Pravougaonik(5, 7);
//
//        t1.stampaj();
//        p1.stampaj();

        figure.add(t1);
        figure.add(t2);
        figure.add(p1);
        figure.add(p2);

        double suma = 0;
        for (int i = 0; i < figure.size(); i++) {
            suma = figure.get(i).obim() + figure.get(i).povrsina();
        }
        System.out.println("Suma povrsina i obima: " + suma);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
        // if(figure.get(i). instance od p02_05_2022.JednakostranicniTrougao) {
        //System.out.println(i + "trougao:");
    }
}
