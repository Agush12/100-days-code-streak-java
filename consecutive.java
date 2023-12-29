import java.util.*;
public class consecutive{
    static int maxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0, curr = 0;
           for(int i = 0; i < n; i++)
    	{
    	if(arr[i] == 0)
    	curr = 0;
    		else
    		{
    			curr++;
res = Math.max(res, curr);}
    	}
    return res;
    }


public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int arr[] = {0, 1, 1, 0, 1, 1, 1};
    int n =arr.length;

       System.out.println(maxConsecutiveOnes(arr, n));
}}