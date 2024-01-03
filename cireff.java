import java.util.*;
public class cireff{
    static int kadane(int arr[]){
        int res=arr[0];int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            res=Math.max(curr,res);
            
        }
        return res;
    }
    static int max(int arr[]){
        int max_normal=kadane(arr);
        if(max_normal<0){
            return max_normal;
        }int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=-arr[i];
            
        }
        int max_cir=sum+kadane(arr);
        int res=Math.max(max_cir,max_normal);
        return res;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={1,4,-5,3,6};
    System.out.println("the normal maximum sum of subarray is "+kadane(arr));
    System.out.println("the overal circular maximum sum of subarray is "+max(arr));
}}