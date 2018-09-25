package Generics;

import java.util.Collections;

public class g4 {
    public static void main(String[] args) {
        System.out.println( enBuyuk(1,6,3) );
        System.out.println( enBuyuk("Adana", "Ankara", "Antalya") );
        System.out.println(enBuyuk(3.14, 2.78, 7.62));
    }
    public static <T extends Comparable<T>> T enBuyuk(T e1, T e2, T e3)
    {
        T max=e1;
        if(e2.compareTo(max)>0)
            max=e2;
        if(e3.compareTo(max)>0)
            max=e3;
        return max;
    }
}
