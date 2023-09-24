public class par_pass {
    static void obj(int B[],int index,int value){
        B[index]=value;
    }
    static void prim(int x,int value){
        x=value;
    }

    public static void main(String args[]){
        int A[]={1,2,3,4};
         System.out.println("array before method call--");
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println("\n array after method call--");

         
        obj(A,0,0);
         for(int x:A){
            System.out.print(x+" ");
        }
         System.out.println();
        int a=10;
     System.out.println("value of a before method call "+a);
        prim(a,20);
        System.out.println("value of a after method call "+a);

        

    }
    
}
