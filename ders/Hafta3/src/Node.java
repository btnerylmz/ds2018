public class Node<T> {
    public T value;//Saklanan değer
    public Node<T> next;//Bir sonraki eleman

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node() { }//Varsayılan yapıcı metod
}