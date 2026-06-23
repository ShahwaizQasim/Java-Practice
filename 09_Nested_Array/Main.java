import java.util.Scanner;

public class Main {
    public static void main() {
        int rowSize = 3;
        int colSize = 5;
        int array[][] = new int[rowSize][colSize];
        array[0][0] = 22;
        array[0][1] = 32;
        array[0][2] = 52;
        array[0][3] = 62;
        array[0][4] = 52;

        array[1][0] = 10;
        array[1][1] = 21;
        array[1][2] = 23;
        array[1][3] = 88;
        array[1][4] = 21;

        array[2][0] = 12;
        array[2][1] = 21;
        array[2][2] = 11;
        array[2][3] = 10;
        array[2][4] = 14;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int rowSize1 = sc.nextInt();
        int colSize1 = sc.nextInt();

        int NumbersArray[][] = new int[rowSize1][colSize1];

        for (int i = 0; i < rowSize1; i++) {
            for (int j = 0; j < colSize1; j++) {
                NumbersArray[i][j] = sc.nextInt();
            }
        }

        // for (int i = 0; i < rowSize1; i++) {
        // for (int j = 0; j < colSize1; j++) {
        // System.out.print(NumbersArray[i][j] + " ");
        // }
        // System.out.println();
        // }

        int x = sc.nextInt();

        for (int i = 0; i < rowSize1; i++) {
            for (int j = 0; j < colSize1; j++) {
                if (NumbersArray[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}
