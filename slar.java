import java.util.*;
public class slar{
    static int slargest(int arr[]){
        int largest =0;
        int res=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest =i;
            
        }
        else if(arr[i]!=arr[largest]){if(res==-1||arr[i]>arr[res]){
            res=i;
        }}

    }
    return res;
}

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[]={1,2,3,4,5,6,1,10,4,5,9,1};
    System.out.println(slargest(arr));
}}