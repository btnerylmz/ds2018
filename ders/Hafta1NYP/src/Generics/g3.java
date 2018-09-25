package Generics;
class Kutu<T>{
    T eleman;
    public void set(T el) {
        eleman=el;
    }
    public T get(){
        return eleman;
    }
}
public class g3 {
    public static void main(String[] args) {
        Kutu<Integer> intKutu=new Kutu<Integer>();
        intKutu.set(5);
        Kutu<String> stringKutu=new Kutu<>();
        stringKutu.set("Merhaba");
        System.out.println(intKutu.get());
        System.out.println(stringKutu.get());
    }
}
