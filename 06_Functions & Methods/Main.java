import java.util.Scanner;

public class Main {

    // ye functions hain ya method hain ?
    // Java me standalone functions nahi hote. Har function kisi na kisi class ke
    // andar hota hai, isliye
    // Java me unhe methods kaha jata hai.

    // Standalone function woh hota hai jo:
    // Kisi class ke andar nahi hota
    // Apni marzi se independent hota hai
    // Direct call ho sakta hai

    // Java me standalone functions hotay hi nahi.
    // Kyunkay:
    // Java me har cheez class ke andar hoti hai
    // Is liye functions ko methods kehte hain

    // Function ussi type ki value return karega jo uski return type me declare ki
    // gayi ho.
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int multipleNumbers(int a, int b) {
        int multiply = a * b;
        return multiply;
    }


    public static void TableGenerate(int a){
         if (a <= 0) {
            System.out.println("Zero se bara number enter karo");
         }
         for (int i = 1; i <= 10; i++) {
            System.out.println(a + " " + "X " + i + " " + "= " + a*i);
         }
         return;
    }

    // Agar function ki return type void ho, to iska matlab hai ke function koi
    // value return nahi karega.
    public static void CalculateFactorial(int n) {
        if (n < 0) {
            System.out.print("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // int multiply = multipleNumbers(a, b);
        // CalculateFactorial(b);
        TableGenerate(b);

        // System.out.println(result);
    }
}
