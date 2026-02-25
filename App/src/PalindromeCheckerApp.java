public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        // Original string to check
        String original = "racecar";

        // Convert string to character array
        char[] chars = original.toCharArray();

        // Two-pointer approach initialization
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters from start and end
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}