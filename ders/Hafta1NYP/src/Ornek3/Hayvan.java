package Ornek3;

public class Hayvan {
    private String adi;
    private int yasi;

    public void tanimla() {
        System.out.println("Ben hayvan sınıfına ait bir nesneyim!");
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }
}

