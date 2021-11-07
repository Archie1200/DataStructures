package CircularDoublyLinkedList;

public class main6 {
    public static void main(String[] args) {
        CircularDoubly obj = new CircularDoubly();
        obj.CreateSingleCircularDoublyLinkedList(9);
        obj.Insert1(1,1);
        obj.Insert1(2,2);
        obj.Insert1(3,3);
        obj.Insert1(4,4);
        obj.Insert1(5,5);
        obj.Insert1(10,3);
        obj.deleteEntireList();
        obj.traversal();
    }
}
