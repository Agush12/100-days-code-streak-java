import java.util.*;
public class seiveOfErathosthenes{
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
        static void sieve(int n){
            boolean Prime[] =new boolean[n+1];
            for(int i=2;i<=n;i++){
                Prime[i]=true;
            }
            for(int i=2;i*i<=n;i++){
                if(isPrime(i)){
                    for(int j=i*i;j<=n;j=j+i){
                        Prime[j]=false;
                    }


                }
            }
            for(int i=2;i<=n;i++){
                if(Prime[i]==true)
                System.out.println(i);
            }
        }

    

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    sieve(n);
}}