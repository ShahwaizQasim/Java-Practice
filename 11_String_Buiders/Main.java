
public class Main {
    public static void main(String args[]) {

        // String
        // Immutable hoti hai.
        // Change karne par nayi object create hoti hai.
        // Chhote text ke liye theek hai.

        // StringBuilder
        // Mutable hota hai.
        // Existing object modify hota hai.
        // Multiple string modifications aur loops me zyada efficient hai.

        String secondName = "Qasim Ali";
        secondName = secondName + " " + "Shah";
        System.out.println(secondName);

        StringBuilder sb = new StringBuilder("Syed Shahwaiz");
        sb.append(" Qasim");
        System.out.println("String Builder " + sb);
        System.out.println(sb.length());

        StringBuilder userName = new StringBuilder("Shahwaiz");

        userName.setCharAt(0, 'Q');
        userName.setCharAt(0, 'S'); // is method se string change kar sakty hain

        userName.insert(0, 'S'); // is method se string add kar sakty hain
        userName.delete(0, 1);

        System.out.println(userName);
        System.out.println(userName.charAt(0));

        StringBuilder ReverseString = new StringBuilder("Qasim");

        // reverse String
        for (int i = 0; i < ReverseString.length() / 2; i++) {
            int front = i;
            int back = ReverseString.length() - i - 1;

            char frontChar = ReverseString.charAt(front);
            char backChar = ReverseString.charAt(back);

            ReverseString.setCharAt(front, backChar);
            ReverseString.setCharAt(back, frontChar);
        }

        System.out.println(ReverseString);

    }
}
