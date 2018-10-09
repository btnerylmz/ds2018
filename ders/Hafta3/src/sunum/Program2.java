package sunum;

public class Program2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(7);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.insertAfter(ll.getHead(), 15);
        ll.print();
        ll.add(0, 76);
        ll.add(5, 41);
        ll.addFirst(12);
        ll.print();
        ll.removeAfter(ll.getHead());
        ll.print();
        ll.removeAt(3);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
