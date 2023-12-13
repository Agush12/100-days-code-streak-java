import java.util.*;
public class jos{
    static int jose(int n,int k){
        if(n==1)
        {return 0;}
        return (jose(n-1,k)+k)%n;

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int k =sc.nextInt();
    System.out.println("the survivor is "+jose(n,k));
}}
