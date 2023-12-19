import java.util.*;
public class leaders{
    static void lead(int arr[]){
        int curr_lead =arr[arr.length-1];
        System.out.println(curr_lead);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>curr_lead){
                curr_lead=arr[i];
                System.out.println(curr_lead);
            }
        }
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={1,2,7,16,4,10,2,9,0,3};
    lead(arr);
}}