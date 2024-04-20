import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class unionn
{
  
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[])
    
    { 
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        h.add(arr2[i]);
    }
   
   ArrayList<Integer> a=new ArrayList<>(h);
   Collections.sort(a);
   return a;
}
public static void main(String args[]){
    int a1[]={1,2,2,3,4,7,6};
    int a2[]={1,3,3,3,4,7,89,9};
    System.out.println(findUnion(a1,a2));
}


}
