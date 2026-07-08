// Tere are three types of sorting
// 1) Bubble Sorting
// 2) Selection Sorting
// 3) Insertion Sorting

public class Main {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {

        // Three types of Array Sorting 
        // 1) Bubble Sort
        // 2) Selection Sort
        // 3) Insertion Sort

        int arr[] = { 7, 8, 3, 2, 1 };

        // bubble sort
        // Bubble Sort mein largest element bubble ki tarah end tak pahunchta hai

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swap
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // selection sort
        // Selection Sort har pass mein minimum value select karta hai.

        // for (int i = 0; i < arr.length - 1; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // System.out.println("Array[j]" + arr[j]);
        // if (arr[j] < arr[smallest]) {
        // smallest = j;
        // }
        // // swap
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }
        // }

        // Insertion Sort: Har element ko sorted part mein uski correct position par
        // insert karta hai.

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}
