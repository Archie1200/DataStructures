package CircularDoublyLinkedList;

public class CircularDoubly {
    public Node head;
    public Node tail;
    public int size;

    public Node CreateSingleCircularDoublyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.prev = node;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void Insert1(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null)
            System.out.println("No");
        else if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            head = node;
            tail.next = node;
            size++;
        } else if (location >= size) {
            tail.next = node;
            node.prev = tail;
            node.next = head;
            tail = node;
            head.prev = node;
            size++;
        } else {
            Node tempNode = head;
            int i;
            for (i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next.prev = node;
            node.prev = tempNode;
            tempNode.next = node;
            size++;
        }
    }

    public void traversal() {
        if (head == null)
            System.out.println("No");
        else {
            int i;
            Node temp = head;
            for (i = 0; i < size; i++) {
                System.out.print(temp.value);
                if (i != size - 1)
                    System.out.print("->");
                temp = temp.next;
            }
        }
        System.out.println("\n");
    }

    public void searching(int searchValue) {
        Node tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (tempNode.value == searchValue) {
                    System.out.println("Found at index" + " " + i);
                    break;
                } else if (i == size - 1)
                    System.out.println("Not Found");
                tempNode = tempNode.next;
            }
        } else
            System.out.println("Not found");
    }

    public void Delete(int location) {
        Node node = new Node();
        if (head == null)
            System.out.println("The list does not exist");
        else if (location == 0) {
            if(size==1){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
            }
            else{
            head = head.next;
            head.prev=tail;
            tail.next = head;
            size--;}
        } else if (location >= size) {
            if(size==1){
                tail=null;
                head=null;
                head.prev=null;
                head.next=null;
            }
            else {
                tail = tail.prev;
                tail.next = head;
                tail.prev = tail;
                size--;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }
    public void deleteEntireList(){
        Node tempNode=head;
        for(int i=0;i<size;i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
            head=null;
            tail=null;
        System.out.println("Successfully deleted");
    }
}