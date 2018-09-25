package Ornek5;

public class Kus extends UcanHayvan {
    String adi;
    int yasi;

    public Kus(String adi, int yasi) {
        this.adi = adi;
        this.yasi = yasi;
    }

    @Override
    void uc() {
        System.out.println("Kanatlarımı çarparak uçarım");
    }
}