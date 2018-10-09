public class MyQueue<T> {
    private int front=-1;
    private int rear=-1;
    private T[] dizi;

    public MyQueue() {
        dizi=(T[]) new Object[20];
    }

    public MyQueue(int boyut) {
        dizi=(T[]) new Object[boyut];
    }

    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }

    public boolean isFull() {
        return rear==dizi.length-1;
    }

    public void enqueue(T eleman) {
        if(isFull())
            throw new RuntimeException("Kuyruk dolu");
        dizi[++rear]=eleman;
        if(front==-1)
            front=0;
    }

    public T dequeue(){
        if(isEmpty())
            throw new RuntimeException("Kuyruk boş");
        T donecek=dizi[front++];
        if(front>rear)
            front=rear=-1;
        return donecek;
    }
    public int count() {
        if(isEmpty())
            return 0;
        return rear-front+1;
    }

    public void print() {
        if(!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.println(dizi[i]);
            }
        }
    }
}
