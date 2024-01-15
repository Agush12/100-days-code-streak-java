import java.util.*;
public class median{
    static double med(int a[],int b[]){
        int low=0,high=a.length;
       int n1=a.length,n2=b.length;
        while(low<=high){
            int i1=(low+high)/2;
            int i2=(n1+n2+1)/2-i1;
            int min1=(i1==n1)?Integer.MAX_VALUE:a[i1];
            int max1=(i1==0)?Integer.MIN_VALUE:a[i1-1];
            int min2=(i2==n2)?Integer.MAX_VALUE:b[i2];
            int max2=(i2==0)?Integer.MIN_VALUE:b[i2-1];
            if(max1<=min2&&max2<=min1){
                if((n1+n2)%2==0){
                    return((double)Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else{
                    return(double)Math.max(max1,max2);
                }
                

            }else if(max1>min2){
                high=i1-1;

            }
            else{
                low=i1+1;
            }

        }return-1;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int a[]={1,2,3,4};
    int b[]={5,7,8,9,10,11,12};
    System.out.println(med(a,b));
}}
