import java.util.HashMap;
import java.util.Scanner;

public class sumK{
    static int sub(int a[],int k){
        int res = 0;
        int sum = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (h.containsKey(sum - k)) {
                res+=h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
            if(sum==k){
             res++;
            }
        }
        
        return res;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int a[]={1,1,1};
    System.out.println(sub(a,2));
}}