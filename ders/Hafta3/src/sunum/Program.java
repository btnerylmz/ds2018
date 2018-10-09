package sunum;


public class Program {
    public static void main(String[] args) {
        Node<Integer> n2=new Node<>();
        n2.value=5;
        Node<Integer> n1=new Node<>(17, n2);
        Node<Integer> n3=new Node<>();
        n3.value=8;
        n2.next=n3;
    }
}
