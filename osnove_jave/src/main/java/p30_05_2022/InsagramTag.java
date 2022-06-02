package p30_05_2022;

public class InsagramTag {
    private String x;
    private String y;
    private String tagovan;

    public InsagramTag() {
    }

    public InsagramTag(String x, String y, String tagovan) {
        this.x = x;
        this.y = y;
        this.tagovan = tagovan;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setTagovan(String tagovan) {
        this.tagovan = tagovan;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getTagovan() {
        return tagovan;
    }
}
