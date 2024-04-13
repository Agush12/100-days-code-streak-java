import java.util.Scanner;
public class anagram{
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
           }
           char a[]=new char[128];
           for(int i=0;i<s.length();i++){
              a[s.charAt(i)]++;
              a[t.charAt(i)]--;
    
           }
           for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return false;
            }
           
           } return true;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    String s="rat";
    String t="tar";
    isAnagram(s,t);
}}