public class LinkedList<T> {
    private Node<T> head;//Başlangıç düğümü
    public LinkedList(){}
    public void print(){ //Tüm listeyi yazdır
        Node<T> current=head;
        while (current!=null){
            System.out.println(current.value+" ");
        }
        System.out.println();
    }
    public Node<T> getHead(){return head;}//İlk düğümü verir
    public void addFirst(T value){ //Listenin başına ekler
        Node<T> newNode=new Node<T>(value, head);
        head=newNode;
    }
    public void addLast(T value){ //Listenin sonuna ekler
        Node<T> current=head;
        while (current.next != null)
            current=current.next;
        current.next=new Node<>(value, null);
    }
    public void insertAfter(Node<T> node, T value){ //Verilen düğümden sonra ekler
        Node<T> newNode=new Node<>(value, node.next);
        node.next=newNode;
    }
    public void add(int index, T value){ //Verilen konumdan sonra ekler
        Node<T> current=head;
        int currentLocation=0;
        while (current != null && currentLocation < index) {
            current=current.next;
            currentLocation++;
        }
        if (currentLocation != index)
            throw new IndexOutOfBoundsException("Listede yeterli eleman yok!");
        insertAfter(current, value);
    }
    public T removeAfter(Node<T> node){return null;}//Verilen düğümden sonrakini siler
    public T removeAt(int index){return null;}//Verilen konumdaki düğümü siler
    public T removeFirst(){ //Listenin başını siler
        Node<T> toDelete=head;
        head=head.next;
        return toDelete.value;
    }
    public T removeLast(){ //Listenin sonunu siler
        Node<T> current=head;
        Node<T> previous=null;
        T r;
        while (current.next != null){
            previous=current;
            current=current.next;
        }
        if(previous!=null){
            r=previous.next.value;
            previous.next=null;
        }
        else {
            r=head.value;
            head=null;
        }
        return r;
    }
}
