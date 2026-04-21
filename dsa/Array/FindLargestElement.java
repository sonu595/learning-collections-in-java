package dsa.Array;

public class FindLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,8,5};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
