package p18_05_2022;

public class mainSlac {
    public static void main(String[] args) {
        SlackMessage m=new SlackMessage();
        m.koJePostavio="Jovana";
        m.datum="26.02.2022. 18:55 ";
        m.tekst="Opet o kafani";

        System.out.println(m.koJePostavio + " - " + m.datum);
        System.out.println(m.tekst);

        SlackMessage n=new SlackMessage();
        n.koJePostavio="Marija";
        n.datum="26.02.2022. 18:56 ";
        n.tekst="O ne";

        System.out.println(n.koJePostavio + " - " + n.datum);
        System.out.println(n.tekst);
    }
}
