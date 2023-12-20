import java.util.*;
public class frequency{
    static void freq(int arr[]){
        int n=arr.length;
        int frequency =1;
        int i =1;
        while(i<n){
            if(arr[i]==arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(i+" "+frequency);
            i++;
            frequency=1;
            

        }
        if(n==1||arr[n-1]!=arr[n-2]){
            System.out.println(n+ " "+1);
        }

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[] = {10,10,10,20,20,30,30,40,50,50,50,50};
    freq(arr);

}}
