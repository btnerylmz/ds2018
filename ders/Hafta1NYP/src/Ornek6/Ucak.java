package Ornek6;
import Ornek4.Hayvan;

//Uçak sınıfı bir hayvan değil ama uçabiliyor
public class Ucak implements IUcan {
    String adi;
    int mil;

    @Override
    public void uc() {
        System.out.println("Pervanemi döndürürüm");
    }
}