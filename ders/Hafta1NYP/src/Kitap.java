public class Kitap {
    private String isbn;
    private String ad;
    private String yazar;
    private String kategori;

    public Kitap(String isbn, String ad, String yazar, String kategori) {
        this.isbn = isbn;
        this.ad = ad;
        this.yazar = yazar;
        this.kategori = kategori;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s",isbn,ad,yazar,kategori);
    }
}
