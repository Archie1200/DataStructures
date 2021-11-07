package CircularLinkedList;

public class Creation {
    public Node head;
    public Node tail;
    public int size;

    public Node CreationOfCircularLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = node;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void InsertCSSL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null)
            CreationOfCircularLinkedList(nodeValue);
        else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
                i++;
            }
            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;
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
    public void searching(int searchValue){
        if(head!=null){
            int i;
            Node temp=head;
            for(i=0;i<size;i++){
                if(temp.value==searchValue) {
                    System.out.println("Found at index" + " " + i);
                    break;
                }
                else if(i==size-1)
                    System.out.println("Not found");


                temp=temp.next;
            }
        }
        else{
            System.out.println("Not found");
        }
    }
    public void delete(int location){
        Node node= new Node();
        if(head==null)
            System.out.println("the CSSl doesnt exist");

        else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }
            else{
                Node tempNode=head;
                for(int i=0;i<location-1;i++){
                    tempNode=tempNode.next;
                }
                tempNode.next=tempNode.next.next;
                size--;
            }

    }
}
