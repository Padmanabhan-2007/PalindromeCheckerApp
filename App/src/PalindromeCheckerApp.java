import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class    PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    // Constructor Injection
    public PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.isPalindrome(str);
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeCheckerApp app =
                new PalindromeCheckerApp(strategy);

        if (app.checkPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}