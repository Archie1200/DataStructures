package CircularLinkedList;

public  class Main4 {
    public static void main(String[] args) {
        Creation obj = new Creation();
        obj.CreationOfCircularLinkedList(5);
        System.out.println(obj.head.value);
        obj.InsertCSSL(2,3);
        obj.InsertCSSL(6,0);
        obj.InsertCSSL(1,5);
        obj.traversal();
        obj.delete(5);
        obj.traversal();
    }
}
