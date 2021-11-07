package stack;

public class MAIN {
    public static void main(String[] args) {
        stack1 obj = new stack1(4);
        boolean ans=obj.StackIsEmpty();
        System.out.println(ans);
        boolean res=obj.StackIsFull();
        System.out.println(res);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();
        obj.pop();
        obj.peek();
    }
}
