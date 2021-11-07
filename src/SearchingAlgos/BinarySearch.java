package SearchingAlgos;

public class BinarySearch {
    public void BS(int arr[],int val){
        int start=0;
        int end=arr.length-1;
        int middle=(start+end)/2;
        while(arr[middle]!=val && start<=end){
            if(val<arr[middle])
                end=middle-1;
            else
                start=middle+1;
            middle=(start+end)/2;
        }
        if(arr[middle]==val)
            System.out.println("Element found at index"+" "+middle);
        else
            System.out.println("Element not found");
    }
}
