public class Increase_s {
    public static void main(String args[]){
    
      int A[]={1,2,3,4,5,6,7,8,9};
      int B[]=new int[2*A.length];
      for(int i=0;i<A.length;i++){
        B[i]=A[i];
      }
     
      A=B;
      B=null;
        for(int x:A){
         System.out.print(x+" ");
      }
      int c[]=null;
      
      
      


    }
    
}
