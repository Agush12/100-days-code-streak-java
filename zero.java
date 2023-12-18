import java.util.*;
public class zero{
    static void swap(int arr[],int a,int b){
    int temp;
    temp =arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    }
    static int [] zeros(int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
        return arr;

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
 int arr[]={10,20,0,0,0,0,0,0,0,0,0,0,1822,1111,0,0,12,0,19,0,0,203,3,10,0,10,0};
 arr=zeros(arr);
 for(int x:arr){
    System.out.println(x);
 }

}}