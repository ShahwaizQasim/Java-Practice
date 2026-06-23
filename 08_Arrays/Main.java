import java.util.Scanner;

public class Main {
    public static void main() {

        // method1
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 66;
        marks[2] = 22;
        // System.out.print (marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // method2
        int[] methods = { 22, 3, 3, 4 };
        System.out.println(methods);

        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int Numbers [] = new int[size];

        // for (int i = 0; i < size; i++) {
        // Numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < Numbers.length; i++) {
        // System.out.print("Numbers " + Numbers[i]+ " ");
        // }

        int arraySize = sc.nextInt();
        // String User_Names_Array [] = new String[arraySize];
        // for (int i = 0; i < arraySize; i++) {
        // User_Names_Array[i] = sc.next();
        // }
        // for (int i = 0; i < User_Names_Array.length; i++) {
        // System.out.println("name " + (i+1) +" is : " + User_Names_Array[i]);
        // }

        // Find the maximum & minimum number in an array of integers.
        int Numbers[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            Numbers[i] = sc.nextInt();
        }

    // min ko sabse bari possible value se initialize karte hain (Integer.MAX_VALUE)
    // max ko sabse chhoti possible value se initialize karte hain (Integer.MIN_VALUE)

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] < min) {
                min = Numbers[i];
                System.out.println("min" + min);
            }
            if (Numbers[i] > max) {
                max = Numbers[i];
                System.out.println("max"+ max);
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
