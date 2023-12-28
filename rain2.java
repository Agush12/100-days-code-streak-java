import java.util.*;
public class rain2{
    static int capacity(int arr[]){
        int res=0;
        int n =arr.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=0;i<n;i++){
            res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={3,0,1,2,5};
    System.out.println(capacity(arr));
}}
