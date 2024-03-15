public class palindrome {
    public static void main(String[] args) {
        
        int number = 12321;
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    static boolean isPalindrome(int x) {
        int m = x;
        int res = 0;
        while (m > 0) {
            res = res * 10 + m % 10;
            m = m / 10;
        }
        return (res == x);
    }
}
 
    

