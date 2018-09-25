package Ornek4;

//Override
public class Kopek extends Hayvan {
    public void havla() {
        System.out.println("Hav hav!");
    }

    @Override
    public void tanimla() {
        System.out.println("Ben köpek sınıfına ait bir nesneyim!");
    }
}
