package Ornek6;

import Ornek4.Hayvan;

public class Balik extends Hayvan implements IYuzen {
    @Override
    public void tanimla() {
        System.out.println("Ben Balik sinifina ait bir nesneyim");
    }

    @Override
    public void yuz() {
        System.out.println("Kuyruğumu sallayarak yüzerim");
    }
}
