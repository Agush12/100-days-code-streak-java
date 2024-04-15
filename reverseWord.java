import java.util.Scanner;
public class reverseWord{
    
        static void reverse(char a[],int start,int end){
        
         while(start<end){
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
         }
         
    
        }
        static String reverseWords(String s) {
           String str= s.trim().replaceAll("\\s+", " ");
    ;
            char a[]=str.toCharArray();
            int start=0;
            int end=0;
            for(end=0;end<a.length;end++){
                if(a[end]==' '){
                    
                    reverse(a,start,end-1);
                    start=end+1;
    
                }
                while(a[end]==' '){
                    end++;
                }
    
             }
             reverse(a,start,a.length-1);
             reverse(a,0,a.length-1);
    
            String s1=new String(a);
            String s2=s1.trim();
            return s2;
            
        }
    

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    String s=" the    sky is blue ";
    String s1=reverseWords(s);
    System.out.println(s1);
}}