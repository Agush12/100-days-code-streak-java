import java.util.*;
public class ropeCut{
    static int maxPiece(int n,int a,int b,int c){
        
        if(n==0)
         {return 0;}
         if(n<0){
            return -1;
         }
         int res=Math.max(maxPiece(n-a,a,b,c),Math.max(maxPiece(n-b,a,b,c),maxPiece(n-c,a,b,c)));
         if(res==-1)
         {return -1;}
         res =res +1;
         return res;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println("enter length and sizes of 3 pieces a,b,c respectively");
    int n =sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("the max no. of cut is "+maxPiece(n,a,b,c));
}}