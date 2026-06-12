import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        // Loops

        for (int i = 0; i < 11; i++) {
            // System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            // System.out.println(i);
        }

        int i = 1;
        while (i <= 10) {
            // System.out.println(i);
            i++;
        }

        int j = 1;
        do {
            // System.out.println(j);
            j++;
        } while (j <= 10);

        // first question practice

        // print event numbers
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                // System.out.print("Even Number" + n);
            } else {
                // System.out.print("Odd Number");
            }
            System.out.println();
        }

        // second question practive

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks");
            System.out.println("Enter 0 to stop");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter student marks(0-100): ");
                int studentMarks = sc.nextInt();
                if (studentMarks >= 90) {
                    System.out.println("This is Good");
                } else if (studentMarks >= 60) {
                    System.out.println("This is also good");
                } else if (studentMarks >= 0) {
                    System.out.println("This is good as well");

                }
            }

        } while (choice != 0);
        System.out.println("Program closed");
        sc.close();
    }
}
