import java.util.*;
public class digits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=0;n>0;i++){
            int r=n%10;
            System.out.println(r);
            n=n/10;
            count++;
        }
        System.out.println("no. of digits are "+count);

    }
    
}
