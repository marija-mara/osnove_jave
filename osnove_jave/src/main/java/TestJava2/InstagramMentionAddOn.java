package TestJava2;

public class InstagramMentionAddOn extends InstagramAddOn {
    InstagramUser tagovan;

    public InstagramMentionAddOn(int id, int x, int y,
                                 int sirinaDodatka, int visinaDodatka,InstagramUser tagovan) {
        super(id, x, y, sirinaDodatka, visinaDodatka);
        this.tagovan=tagovan;

    }

    public InstagramUser getTagovan() {
        return tagovan;
    }

    public void setTagovan(InstagramUser tagovan) {
        this.tagovan = tagovan;
    }

    @Override
    public int minimalnaSirinaDodatka() {
        return 80;
    }

    @Override
    public int minimalnaVisinaDodatka() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.getX() + ", " + this.getY()
                + "] (" + this.getVisinaDodatka() + ", " + this.getSirinaDodatka() + ") "
                + "@" + tagovan.getUsername() + "/" + tagovan.linkDoProfila());

    }
}
