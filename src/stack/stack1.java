package stack;

import java.util.Arrays;

public class stack1 {
    public int arr[];
    public int topOfStack;
    stack1(int size){
        arr=new int[size];
        topOfStack=-1;
        System.out.println("Stack is created of size"+" "+size);
    }
    public boolean StackIsEmpty(){
        if(topOfStack==-1)
            return true;
        else return false;
    }
    public boolean StackIsFull(){
        if(topOfStack==arr.length-1)
            return true;
        else return false;
    }
    public void push(int value){
        if(StackIsFull()){
            System.out.println("The Stack is Full");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Successfully inserted");
        }
        System.out.println(Arrays.toString(arr));
    }
    public void pop(){
        if(StackIsEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            int topValue= arr[topOfStack];
            topOfStack--;
            System.out.println(topValue);
        }
    }
    public void peek(){
        if(StackIsEmpty())
            System.out.println("stack is Empty");
        else
            System.out.println(arr[topOfStack]);
    }
}
