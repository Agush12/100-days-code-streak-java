import java.util.*;
public class prefix2{
    static boolean isEq(int arr[]){
        int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
       }int lsum=0;
       for(int i=0;i<arr.length;i++){
        if(lsum==sum-arr[i]){
            System.out.println(arr[i]);
            return true;
        }
        lsum+=arr[i];
        sum-=arr[i];
        
       }
       return false;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={4,2,-2,};
    System.out.println(isEq(arr));
}}