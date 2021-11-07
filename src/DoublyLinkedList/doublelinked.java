package DoublyLinkedList;

public class doublelinked {
    public Node head;
    public Node tail;
    public int size;

    public Node DoublyLinkedListCreation(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
            DoublyLinkedListCreation(nodeValue);
            return;
        } else if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void reversetraversal() {
        if (head != null) {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println("\n");
    }
    public void delete(int location){
            if (head == null) {
                System.out.println("The DLL does not exist!");
                return;
            } else if (location == 0) {
                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                } else {
                    head = head.next;
                    head.prev = null;
                    size--;
                }
            } else if (location >= size) {
                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                } else {
                    tail.prev.next = null;
                    tail = tail.prev;
                    size--;
                }
            } else {
                Node tempNode = head;
                for (int i = 0; i < location-1; i++) {
                    tempNode = tempNode.next;
                }

                tempNode.next.prev = tempNode;
                tempNode.next = tempNode.next.next;
                size--;
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
    public void DeleteEntireList(){
        Node tempNode=head;
        int index=0;
        while(index<size){
            tempNode.prev=null;
            tempNode=tempNode.next;
            index++;
        }
        head=null;
        tail=null;
        System.out.println("The List is successfully deleted");
    }
}