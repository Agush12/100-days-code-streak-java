import java.util.Arrays;
import java.util.Scanner;
public class leftMostNonRepating{
    static int left(String s){ 
        int a[]=new int[256];
        Arrays.fill(a,-1);
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]==-1){
                a[s.charAt(i)]=i;
            }
            else{
                a[s.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                res=Math.min(res,a[i]);
            }

        }
        return (res==Integer.MAX_VALUE)?-1:res;
        
    }
        
    
    

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    left("abcdabc");
}}
