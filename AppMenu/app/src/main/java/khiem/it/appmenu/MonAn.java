package khiem.it.appmenu;

public class MonAn {
        private String tenMonAn;
        private double donGia;
        private String moTaMonAn;
        private int idAnhMinhHoa;

        // Hàm tạo


    public MonAn(String tenMonAn, double donGia, String moTaMonAn, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTaMonAn = moTaMonAn;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    // Các getter và setter
    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTaMonAn() {
        return moTaMonAn;
    }

    public void setMoTaMonAn(String moTaMonAn) {
        this.moTaMonAn = moTaMonAn;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
