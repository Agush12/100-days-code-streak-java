import java.util.*;
public class AP_GP {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first term and common difference/ratio");
        int a=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("enter the number of terms");
        int n =sc.nextInt();
        System.out.println("AP is-");
        for(int i=0;i<n;i++){
          int f= a+i*d;
            System.out.println(f);

        }
        System.out.println("GP is-");
        for(int i=1;i<=n;i++){
                        System.out.println(a);
            a=a*d;

        }
        

    

        
    }
}
