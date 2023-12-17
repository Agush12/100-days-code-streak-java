import java.util.*;
public class remove{
    static int [] remDup(int arr[]){
        int temp[]=new int[arr.length];
        temp[0]=arr[0];
       int res=1;
       for(int i=1;i<arr.length;i++){
        if(temp[res-1]!=arr[i])
        {temp[res]=arr[i];
        res++;}
       }
       return temp;

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[] ={10,10,20,20,30,40,40,40,40};
    arr=remDup(arr);
    for(int x:arr){
        System.out.println(x);
    }

}}
