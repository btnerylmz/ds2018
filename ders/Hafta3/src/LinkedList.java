public class LinkedList<T> {
    private Node<T> head;//Başlangıç düğümü
    public LinkedList(){}
    public void print(){ //Tüm listeyi yazdır
        Node<T> node=head;
        while(node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
    }
    public Node<T> getHead(){return head;}//İlk düğümü verir
    public void addFirst(T value){ //Listenin başına ekler
        Node<T> node=new Node<>(value,head);
        head=node;
    }
    public void addLast(T value){ //Listenin sonuna ekler
        if(head==null) {
            addFirst(value);
            return;
        }
        Node<T> node=head;
        while(node.next!=null)
            node=node.next;
        node.next=new Node<>(value, null);
    }
    public void insertAfter(Node<T> node, T value){ //Verilen düğümden sonra ekler
        Node<T> newNode=new Node<>(value,node.next);
        node.next=newNode;
    }
    public void insertAfter(int index, T value){ //Verilen konumdan sonra ekler
        Node<T> current=head;
        int currentLocation=0;
        while (currentLocation<index && current!=null) {
            current=current.next;
            currentLocation++;
        }
        if(currentLocation!=index)
            throw new IndexOutOfBoundsException("Listede yeterli eleman yok!");
        insertAfter(current, value);
    }
    public T removeFirst(){ //Listenin başını siler
        T r=head.value;
        head=head.next;
        return r;
    }
    public T removeLast() { //Listenin sonunu siler
        Node<T> current=head;
        Node<T> previous=null;
        T r;//Dönecek değer
        while(current!=null){
            previous=current;
            current=current.next;
        }
        if(previous!=null){//Birden fazla eleman varsa
            r=previous.next.value;
            previous.next=null;
        }
        else{//Tek eleman varsa
            r=head.value;
            head=null;
        }
        return r;
    }

    public T removeAfter(Node<T> node){return null;}//Verilen düğümden sonrakini siler
    public T removeAt(int index){return null;}//Verilen konumdaki düğümü siler
}
