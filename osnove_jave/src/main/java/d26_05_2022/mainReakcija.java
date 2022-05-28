package d26_05_2022;

public class mainReakcija {
    public static void main(String[] args) {
        facebookPost p = new facebookPost("Nemanja", "poljubci");
        Reakcija r1 = new Reakcija("Srce", "MarijaJ");
        Reakcija r2 = new Reakcija("Srce", "MarijaJ");
        Reakcija r3 = new Reakcija("like", "MarijaJ");
        Reakcija r4 = new Reakcija("like", "Milan");
        Reakcija r5 = new Reakcija("srce", "Ana");
        p.reaguj(r1);
        p.reaguj(r5);
        p.brojReakcija("Smajli");
        p.brojReakcija("Srce");
        p.stampaj();
    }
}
