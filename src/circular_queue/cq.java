package circular_queue;

public class cq {
    int arr[];
    int beginning;
    int topOfQueue;
    cq(int size){
        arr= new int [size];
        beginning=-1;
        topOfQueue=-1;
        System.out.println("Circular Queue is created");
    }
    public boolean isEmpty(){
       if(beginning==-1 || topOfQueue==-1)
           return true;
       else
           return false;
    }
    public boolean isFull(int size){
        if(beginning==0 && topOfQueue+1==size)
            return true;
        else if(topOfQueue+1==beginning)
            return true;
        else return false;
    }

}
