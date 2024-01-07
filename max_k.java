import java.util.*;
public class max_k{
    static int max(int arr[],int k){
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];

        }
        int max=curr;
        for(int i=k;i<arr.length;i++){
            curr+=(arr[i]-arr[i-k]);
            max=Math.max(curr,max);
        }
        return max;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={1,8,30,-5,20,7};
    System.out.println(max(arr,3));
}}