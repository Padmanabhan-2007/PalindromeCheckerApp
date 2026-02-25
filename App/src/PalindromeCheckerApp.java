import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        // Original string to check
        String original = "madam";

        // Create a queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and push each character
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            queue.add(ch);    // enqueue
            stack.push(ch);   // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop characters
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove();  // dequeue
            char fromStack = stack.pop();     // pop

            if (fromQueue != fromStack) {
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