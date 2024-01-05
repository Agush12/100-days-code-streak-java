import java.util.*;
public class recurcomp{
    static int power1(int x,int n){
        if(n==0){
            return 1;
        }
        int temp=power1(x,n/2)*power1(x,n/2);
        if(n%2!=0){
            return x*temp;
        }else{
            return temp;
        }
    }  static int power2(int x,int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
              res= res*x;
              x=x*x;
              n=n/2;
                
            }}return res;
        }
      

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println(power1(3,3));
    System.out.println(power2(3,3));
}}