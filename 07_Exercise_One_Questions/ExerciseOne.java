import java.util.Scanner;

public class ExerciseOne {
    public static int ThreeNumbersAverage(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        return average;
    }

    public static int SumOddNumbers(int n) {
        if (n < 0) {
            System.out.println("Enter your positive number");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("");
            } else {
                sum = sum + i;
            }
        }
        return sum;
    }

    // For n = 8:
    // 0 1 1 2 3 5 8 13
    public static void FibonacciSeriesNumbersPrint(int n) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }


// Greatest Common Divisor
//     public static int gcd(int a, int b) {
//     while (b != 0) {
//         int temp = b;
//         b = a % b;
//         a = temp;
//     }
//     return a;
// }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // int result = ThreeNumbersAverage(num1, num2, num3);
        // int result = SumOddNumbers(num1);
        // FibonacciSeriesNumbersPrint(num1);
        // System.out.println(result);

    }
}
