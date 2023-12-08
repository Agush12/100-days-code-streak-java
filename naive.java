import java.util.*;
public class naive{
    static boolean isPrime(int n){
        if(n==1)
        return false;
        if(n==2||n==3)
        return true;
        if(n%2==0||n%3==0)
        return false;
        for(int i=5;i*i<=n;i++){
            if(n%i==0||n%(i+2)==0)
            return false;
        }
        return true;

    }
    static void primefactor(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;

                }
            }
        }
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n =sc.nextInt();
    primefactor(n);


}}