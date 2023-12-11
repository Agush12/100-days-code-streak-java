import java.util.*;
public class palin{
    static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)&&isPalindrome(str,start+1,end-1));
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
   String n =sc.nextLine();
   System.out.println(isPalindrome(n,0,n.length()-1));
}}