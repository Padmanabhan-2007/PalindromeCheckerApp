import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        // Original string to check
        String original = "deed";

        // Create a stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Build the reversed string by popping from stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}