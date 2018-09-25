package Ornek2;
public class Kopek {
    private String adi;
    private int yasi;

    void havla() {
        System.out.println("Hav hav!");
    }

    public String getAdi() {
        return adi;
    }

    void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        if(yasi>0)
            this.yasi = yasi;
    }
}
