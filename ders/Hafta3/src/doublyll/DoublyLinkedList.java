package doublyll;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        size=0;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public void addFirst(T value){
        Node<T> node=new Node(value, head, null);
        if (head!=null)
            head.previous=node;
        head=node;
        if (tail==null)
            tail=node;
        size++;
    }
    public void addLast(T value){
        Node<T> node=new Node<>(value, null, tail);
        if (tail!=null)
            tail.next=node;
        tail=node;
        if(head==null)
            head=node;
        size++;
    }
    public T removeFirst(){
        Node<T> node=head;
        head=head.next;
        head.previous=null;
        size--;
        return node.value;
    }
    public T removeLast(){
        Node<T> node=tail;
        tail=tail.previous;
        tail.next=null;
        size--;
        return node.value;
    }
    public void print(){
        Node<T> node=head;
        while(node!=null) {
            System.out.print(node.value + " ");
            node=node.next;
        }
        System.out.println();
    }
    public void reversePrint(){
        Node<T> node=tail;
        while(node!=null) {
            System.out.print(node.value + " ");
            node=node.previous;
        }
        System.out.println();
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    @Override
    public Iterator<T> iterator() {
        //Interface gerçekleştiren nesne oluşturma
        Iterator<T> iterator=new Iterator<T>() {
            private Node<T> node=head;
            @Override
            public boolean hasNext() { //Sonraki değer var mı
                return node!=null;
            }
            @Override
            public T next() { //Sonraki değeri döndür
                T rval=node.value;
                node=node.next; //iterator'u ilerlet
                return rval;
            }
        };
        return iterator;
    }

    //public abstract void insertAt(int index, T value);
    //public abstract T removeAt(int index);
}
