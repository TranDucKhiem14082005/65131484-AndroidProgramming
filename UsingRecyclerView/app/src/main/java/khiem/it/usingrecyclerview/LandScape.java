package khiem.it.usingrecyclerview;

public class LandScape {
    String landImage;
    String landCaption;

    public LandScape(String landImage, String landCaption) {
        this.landImage = landImage;
        this.landCaption = landCaption;
    }

    public String getLandImage() {
        return landImage;
    }

    public void setLandImage(String landImage) {
        this.landImage = landImage;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
