public class QueueMain {
    public static void main(String[] args) {
        MyQueue<Integer> q=new MyQueue<>();
        MyQueue q3=new MyQueue();
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.print();
        MyQueue<String> q2=new MyQueue<>();
        q2.enqueue("Merhaba");

    }
}
