import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Method
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Reverse Method Performance
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Method Performance
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Method Performance
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("Input String: " + input);
        System.out.println();

        System.out.println("Reverse Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println();

        System.out.println("Stack Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        System.out.println();

        System.out.println("Deque Method: " + result3);
        System.out.println("Execution Time: " + time3 + " ns");
    }
}