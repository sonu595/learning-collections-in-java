package dsa.sorting.selectionsort;

public class sort1 {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 7, 6, 2, 9, 0, 5, 8};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printarray(arr);
    }
}