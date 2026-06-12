// Java mein compilation aur execution alag phases hain. Compilation ke waqt source code bytecode 
// mein convert hota hai, jabke execution ke waqt JVM main() se start karke code ko control flow
// ke mutabiq chalati hai. Puri file ek saath execute nahi hoti; sirf woh code execute hota hai
// jo runtime path mein aata hai.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Shahwaiz Qasim";
        int a = 2;
        int b = 3;
        int sum = a + b;
        // System.out.println("Hello World! " + sum);
        // System.out.print(sum);

name = "Syed";
// System.out.println(name);

a = 6;
// System.out.println(a);


// Input 

Scanner sc = new Scanner(System.in);
String userName = sc.nextLine();
// nextInt
// nextFloat
// nextLine
// System.out.println(userName);


int firstNum = sc.nextInt();
int secondNum = sc.nextInt();
int UserSum = firstNum + secondNum;
System.out.println(UserSum);

    }
}
// Data Types:

// Primitive Types
// byte
// sort 
// char
// boolean
// int
// long
// float double

// Non-Primitive Types
// String
// Array 
// Class
// Object Interface 