package sunum;
public class LinkedList<T> {
    private Node<T> head;//Başlangıç düğümü
    public LinkedList(){}
    public void print(){}//Tüm listeyi yazdır
    public Node<T> getHead(){return null;}//İlk düğümü verir
    public void addFirst(T value){}//Listenin başına ekler
    public void addLast(T value){}//Listenin sonuna ekler
    public void add(int index, T value){}//Verilen konumdan sonra ekler
    public void insertAfter(Node<T> node, T value){}//Verilen düğümden sonra ekler
    public T removeAfter(Node<T> node){return null;}//Verilen düğümden sonrakini siler
    public T removeAt(int index){return null;}//Verilen konumdaki düğümü siler
    public T removeFirst(){return null;}//Listenin başını siler
    public T removeLast(){return null;}//Listenin sonunu siler
}
