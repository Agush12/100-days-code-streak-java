import java.util.*;
public class vararg{
    static void var_arg(int ...A){
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println();

    } static void array_arg(int []A){
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println();

    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    int a[] = {1,2,3,4,5,6,7,6,4,4};
    var_arg(a);
    array_arg(a);
    var_arg(1,2,3,4);
    array_arg(1,2,3,4);
}}