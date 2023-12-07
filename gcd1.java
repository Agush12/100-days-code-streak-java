import java.util.*;
public class gcd1{
    static int gcd(int a,int b){
        int n =Math.min(a,b);
        while(n>0){
            if(a%n==0&&b%n==0){
                return n;
            }
            n--;

        }
        return n;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers");
    int n =sc.nextInt();
    int m =sc.nextInt();
    System.out.println(gcd(n,m));
}}
