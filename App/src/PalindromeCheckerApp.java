public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "racecar";
        char[] chars = original.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}