package DoublyLinkedList;

public class main5 {
    public static void main(String[] args) {
        doublelinked obj = new doublelinked();
        obj.DoublyLinkedListCreation(3);
        System.out.println(obj.head.value);
        obj.insertDLL(2,1);
        obj.insertDLL(1,3);
        obj.insertDLL(3,2);
        obj.traversal();
        obj.DeleteEntireList();
        obj.traversal();
    }
}
