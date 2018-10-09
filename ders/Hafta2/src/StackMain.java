public class StackMain {
    public static void main(String[] args) {
        MyStack<Integer> s=new MyStack<>();
        s.push(5);
        s.push(2);
        s.push(7);
        s.pop();
        s.push(6);
        s.push(9);
        s.push(4);
        s.pop();
        s.pop();
        s.push(12);
        s.print();
        while (!s.isFull())
            s.push(1);
    }
}
