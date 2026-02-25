import java.util.Scanner;

class UseCase11PalindromeCheckerApp {

    // PalindromeChecker class encapsulates all palindrome logic
    static class PalindromeChecker {

        // Method to check if a string is a palindrome
        public boolean checkPalindrome(String str) {
            if (str == null) return false;

            // Normalize string: remove spaces and convert to lowercase
            String normalized = str.replaceAll("\\s+", "").toLowerCase();

            // Two-pointer approach
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String userInput = scanner.nextLine();

        // Create instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome and print result
        if (checker.checkPalindrome(userInput)) {
            System.out.println("The string \"" + userInput + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + userInput + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}