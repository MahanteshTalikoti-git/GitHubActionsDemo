public class PalindromeChecker {
    
    /**
     * Checks if a string is a palindrome (ignoring spaces and case)
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Remove spaces and convert to lowercase
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        
        // Check if the string equals its reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    /**
     * Checks if a string is a palindrome (considering only alphanumeric characters)
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeAlphanumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Keep only alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the string equals its reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    /**
     * Checks if a number is a palindrome
     * @param num the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindromeNumber(int num) {
        String numStr = String.valueOf(Math.abs(num));
        String reversed = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversed);
    }
    
    public static void main(String[] args) {
        // Test cases for string palindromes
        System.out.println("=== String Palindrome Tests ===");
        System.out.println("racecar: " + isPalindrome("racecar"));           // true
        System.out.println("A man a plan a canal Panama: " + isPalindrome("A man a plan a canal Panama")); // true
        System.out.println("hello: " + isPalindrome("hello"));               // false
        System.out.println("madam: " + isPalindrome("madam"));               // true
        
        System.out.println("\n=== Alphanumeric Palindrome Tests ===");
        System.out.println("A1b1A: " + isPalindromeAlphanumeric("A1b1A"));   // true
        System.out.println("race a car: " + isPalindromeAlphanumeric("race a car")); // false
        System.out.println("0P: " + isPalindromeAlphanumeric("0P"));         // false
        
        System.out.println("\n=== Number Palindrome Tests ===");
        System.out.println("121: " + isPalindromeNumber(121));               // true
        System.out.println("-121: " + isPalindromeNumber(-121));             // true
        System.out.println("10: " + isPalindromeNumber(10));                 // false
        System.out.println("12321: " + isPalindromeNumber(12321));           // true
    }
}
