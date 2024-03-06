class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String testString = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = solution.isPalindrome(testString);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
