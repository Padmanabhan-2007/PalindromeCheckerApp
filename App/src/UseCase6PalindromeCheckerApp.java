import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        // Original string to check
        String original = "rotor";

        // Create a deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty or has one element
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}