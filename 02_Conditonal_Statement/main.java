import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("hell0 world");

        int a = 20;
        int b = 21;

        if (a > b) {
            System.out.println("A Greater");
        } else {
            if (b > a) {
                System.out.println("B is Greater");
            } else {
                System.out.println("A is lesser");
            }
        }

        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("Eligible");
        // } else {
        // System.out.println("Not Eligible");
        // }

        // System.out.println("Enter Weekday");
        // String weekDayName = sc.nextLine();

        // agr apko mutiple condition check karni hai so if else/if ka use na karo code
        // complex ho jata hai

        // if (weekDayName.equals("Monday")) {
        // System.out.println("1");
        // } else if (weekDayName.equals("Tuesday")) {
        // System.out.println("2");
        // } else if (weekDayName.equals("Wednesday")) {
        // System.out.println("3");
        // } else if (weekDayName.equals("Thursday")) {
        // System.out.println("4");
        // } else if (weekDayName.equals("Friday")) {
        // System.out.println("5");
        // } else if (weekDayName.equals("Saturday")) {
        // System.out.println("6");
        // } else if (weekDayName.equals("Sunday")) {
        // System.out.println("7");
        // } else {
        // System.out.println("No valid weekday");
        // }

        // clean Code for multiple condition use
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                break;
        }

        
    }
}
