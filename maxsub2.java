import java.util.*;
public class maxsub2{
    static int max(int arr[]){
        int res=arr[0],maxEnd=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnd=Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(maxEnd,res);
        }
        return res;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={2,3,-8,7,-1,2,3};
    System.out.println(max(arr));
}}