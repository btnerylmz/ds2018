package Ornek6;

import Ornek4.Hayvan;

public class Ordek extends Hayvan implements IUcan,IYuzen {
    public void vak() {
        System.out.println("Vak vak!");
    }

    @Override
    public void tanimla() {
        System.out.println("Ben Ordek sınıfına ait bir nesneyim");
    }

    @Override
    public void uc() {
        System.out.println("Kanatlarımı çarparak uçarım");
    }

    @Override
    public void yuz() {
        System.out.println("Ayaklarımı çırparım");
    }
}
