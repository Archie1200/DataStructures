package Queue;

public class main {
    public static void main(String[] args) {
        queue1 obj = new queue1(5);
        System.out.println(obj.isEmpty());
        obj.enqueue(1);
        obj.enqueue(4);
        obj.enqueue(2);
        obj.enqueue(9);
        obj.enqueue(10);
        obj.delete();
    }
}

