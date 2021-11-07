package SearchingAlgos;

public class LinearSearch {
    public void LS(int arr[], int val) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                int j=i+1;
                System.out.println("Element found at position"+" "+ j);
                c = 1;
                break;
            }
        }
        if (c == 0)
            System.out.println("Element Not found");
    }
}
