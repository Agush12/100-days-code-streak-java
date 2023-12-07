import java.util.*;
public class euclidian{

    static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers");
    int n =sc.nextInt();
    int m =sc.nextInt();
    System.out.println(GCD(n,m));

}}
