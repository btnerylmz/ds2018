package Generics;

import java.util.ArrayList;
import java.util.List;

public class g1 {
    public static void main(String[] args) {
        List liste=new ArrayList();
        liste.add(3);//Tamsayı ekle
        liste.add("metin");//String ekle
        int i=(int)liste.get(0);//int'e dönüştür
        String s=(String)liste.get(1);//String'e dönüştür
        double k=(double)liste.get(1);//cast hatası verir

        List<Double> gListe=new ArrayList<>();
        //gListe.add("metin");//Kod derlenmez
        gListe.add(3.14);
        gListe.add(2.7182818284);
        double d=gListe.get(0);//cast gerekmez
    }
}
