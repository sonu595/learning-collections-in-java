package dsa.Array.Subarray;

// this is how to find maximum sub arrays of a perticular array
public class posiblesubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for(int st=0;st<n;st++){
            for(int end=st;end<n;end++){
                for(int i=st;i<=end;i++){
                    System.out.print( arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        usingBruteForce(arr);
    }



    public static void usingBruteForce(int arr[]) {
        int n = arr.length;

        int maxsum = Integer.MIN_VALUE;

        for (int st = 0; st < n; st++) {

            int currentsum = 0;

            for (int end = st; end < n; end++) {

                currentsum += arr[end];

                maxsum = Math.max(currentsum, maxsum);
            }
        }

        System.out.println("Maximum Sum = " + maxsum);
    }
}
