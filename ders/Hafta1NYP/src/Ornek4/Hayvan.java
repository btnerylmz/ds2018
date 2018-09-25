package Ornek4;
//Çok biçimlilik(polymorphism)
public class Hayvan {
    private String adi;
    private int yasi;

    public void tanimla() {
        System.out.println("Ben hayvan sınıfına ait bir nesneyim!");
    }

    public Hayvan(){
        adi="Bobi";
        yasi=4;
    }

    public Hayvan(String adi) {
        this.adi = adi;
        yasi=10;
    }

    public Hayvan(String adi, int yasi) {
        this.adi = adi;
        this.yasi = yasi;
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

