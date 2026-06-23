import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "Syed Shahwaiz";
        // String UserName = sc.nextLine();
        // System.out.println(UserName);

        String firstName = "Syed";
        String secondName = "Shahwaiz";
        String FinalAlpha = firstName + " " + secondName;

        // index se hum string kay kisi bi character ko catch kar sakty hain
        // System.out.println(FinalAlpha.charAt(0));

        // length-function variable ki length btata hai
        // System.out.println(FinalAlpha.length()); // variable me 13 charaters hain

        for (int i = 0; i < FinalAlpha.length(); i++) {
            // System.out.print(FinalAlpha.charAt(i));
        }

        // Compare Strings
        String name1 = "Ali";
        String name2 = "Ali";
        if (name1.equals(name2)) {
            // System.out.println("They are the same string");
        } else {
            // System.out.println("They are different Strings");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            // System.out.println("They are the same string");
        } else {
            // System.out.println("They are different strings");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }


        // Substring 
        String FatherName = "Qasim Ali";

        // Java me substring() method kisi string ka hissa (portion) nikalne ke liye use hota hai.
        System.out.println(FatherName.substring(6 ));


        // Type Casting
        // ParseInt 
        // String convert to number 
        String str = "123";
        int number = Integer.parseInt(str); // Integer.parseInt(str) string ko int me convert karta hai.
        System.out.println(number);
        
        int number1 = 123;
        String str1 = Integer.toString(number1); // Integer.toString(number1) int ko string me convert karta hai
        System.out.println(str1);

    }
}
