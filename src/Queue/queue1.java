package Queue;

import java.util.Arrays;

public class queue1 {
    int arr[];
    int beginning;
    int topOfQueue;
    queue1(int size){
        arr= new int[size];
        beginning=-1;
        topOfQueue=-1;
        System.out.println("Queue is created");
    }
    public boolean isEmpty(){
        if(beginning==-1 || beginning==arr.length){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(topOfQueue==arr.length-1)
            return true;
        else
            return false;
    }
    public void enqueue(int value) {
        if (isFull())
            System.out.println("The Queue is Full");
        else if (isEmpty()) {
            beginning = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void dequeue(){
        if(isEmpty())
            System.out.println("The stack is empty");
        else{
            int begvalue=arr[beginning];
            beginning++;
            System.out.println(begvalue);
        }
    }
    public void peek(){
        if(isEmpty())
            System.out.println("the stack is empty");
        else{
            System.out.println(arr[beginning]);
        }
    }
    public void delete(){
        arr=null;
        System.out.println("The Queue is successfully deleted");
        System.out.println(Arrays.toString(arr));
    }

}
