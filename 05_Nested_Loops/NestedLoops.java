
public class NestedLoops {
    public static void main(String[] args) {

        // int n = 5;
        // int m = 4;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int m = 4;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // Output
        // ****
        // * *
        // * *
        // * *
        // ****
        // }

        // int k = 4;
        // for (int i = 0; i <= k; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // Outout:
        // *
        // **
        // ***
        // ****
        // *****
        // }

        int l = 4;
        for (int i = l; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Output:
        // ****
        // ***
        // **
        // *

        int w = 5;
        for (int i = 0; i <= w; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    // System.out.print(1 + " ");
                } else {
                    // System.out.print(0 + " ");
                }
            }
            System.out.println();

            // Output:
            // 1
            // 0 1
            // 1 0 1
            // 0 1 0 1
            // 1 0 1 0 1
            // 0 1 0 1 0 1
        }

        int v = 4;
        // upper half
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (v - i);

            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = v; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (v - i);

            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

            // * *
            // ** **
            // *** ***
            // ********
            // ********
            // *** ***
            // ** **
            // * *

        }

        int s = 5;
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Output
        // *****
        // *****
        // *****
        // *****
        // *****

    }
}
