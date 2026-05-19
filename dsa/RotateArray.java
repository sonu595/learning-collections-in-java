package dsa;

import java.util.Arrays;

import dsa.String.reverseString;

public class RotateArray {
    // Brute force aproach
    // time complexity = O(n*k), space complexity = O(1)
    public static void rotateBruteforce(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        for(int i = 0; i<k;i++){
            int last = arr[n-1];
            for(int j = n-1; j>0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
    }


    // using extra array
    // time = O(n), space = O(n) by using extra space
    public static void rotateextraarray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[(i+k) % n] = arr[i]; 
        }
        for(int i = 0; i<n;i++){
            arr[i] = temp[i];
        }
    }

    public static void rotateReverce(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    // actual reverse method
    public static void reverse(int[] arr, int start, int end){
        while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start ++;
         end --;   
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        // rotateBruteforce(arr, k);
        // rotateReverce(arr, k);
        rotateextraarray(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
