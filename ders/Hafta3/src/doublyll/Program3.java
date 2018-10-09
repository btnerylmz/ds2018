package doublyll;

public class Program3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> ll=new DoublyLinkedList<>();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(7);
        ll.addFirst(9);
        for (int deger:ll){
            System.out.println(deger);
        }
    }
}
