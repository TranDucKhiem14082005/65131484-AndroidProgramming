package thigk2.tranduckhiem;

public class LandScape {
    private String landscapeName;
    private String landscapeImage;
    private String landscapeQueQuan;

    public LandScape(String landscapeName, String landscapeImage, String landscapeQueQuan) {
        this.landscapeName = landscapeName;
        this.landscapeImage = landscapeImage;
        this.landscapeQueQuan = landscapeQueQuan;
    }


    public String getLandscapeQueQuan() {
        return landscapeQueQuan;
    }

    public void setLandscapeQueQuan(String landscapeQueQuan) {
        this.landscapeQueQuan = landscapeQueQuan;
    }

    public String getLandscapeName() {
        return landscapeName;
    }

    public void setLandscapeName(String landscapeName) {
        this.landscapeName = landscapeName;
    }

    public String getLandscapeImage() {
        return landscapeImage;
    }

    public void setLandscapeImage(String landscapeImage) {
        this.landscapeImage = landscapeImage;
    }
}
