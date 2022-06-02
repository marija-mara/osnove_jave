package d26_05_2022;

public class mainReakcija {
    public static void main(String[] args) {
        facebookPost p = new facebookPost("Nemanja", "poljubci");
        Reakcija r1 = new Reakcija(Reakcija.ReakcijaEnum.LIKE, "MarijaJ");
        Reakcija r2 = new Reakcija(Reakcija.ReakcijaEnum.SRCE, "MarijaJ");
        Reakcija r3 = new Reakcija(Reakcija.ReakcijaEnum.SMILE, "MarijaJ");
        Reakcija r4 = new Reakcija(Reakcija.ReakcijaEnum.LIKE, "Milan");
        Reakcija r5 = new Reakcija(Reakcija.ReakcijaEnum.SRCE, "Ana");
        p.reaguj(r1);
        p.reaguj(r5);


        p.stampaj();
    }
}
