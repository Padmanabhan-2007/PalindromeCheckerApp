import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome ignoring case and spaces
    public static boolean isPalindrome(String str) {
        // Normalize: remove spaces and convert to lower case
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer comparison
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("The string \"" + userInput + "\" is a Palindrome (case-insensitive, spaces ignored).");
        } else {
            System.out.println("The string \"" + userInput + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}