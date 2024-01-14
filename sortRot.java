import java.util.*;
public class sortRot{
    static int search(int arr[],int x){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
             return mid;
            }
            if(arr[low]<arr[mid]){
                if(arr[low]<=x&&arr[mid]>x){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(arr[high]>=x&&arr[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }return -1;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={3,4,6,7,1,2};
    System.out.println(search(arr,7));
}}