public class rev_copy2 {
    public static void main(String args[]){
       int A[]={1,2,3,4,5,6,7,8,9,10};
       int b[]= new int[10];
       for(int x:A){
        System.out.print(x+" ");
 
       }
       System.out.println();
       for(int i=0,j=b.length-1;i<A.length;i++,j--){
        b[j]=A[i];
       }
       for(int x:b){
        System.out.print(x+" ");
 
       }

    }
    
}