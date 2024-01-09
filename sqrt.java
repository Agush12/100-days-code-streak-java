import java.util.*;
public class sqrt{
    static int sq(int n){
        int low=1,high=n,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            }
            else if(square>n){
                high=mid-1;

            }
            else{
                ans=mid;
                low=mid+1;

            }
        }return ans;

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println(sq(15));
    System.out.println(sq(16));
    System.out.println(sq(10));

}}