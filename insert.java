public class insert {
    public static void main(String args[]){
        int a[]=new int[10];
        a[0]=5;
        a[1]=10;
        a[2]=3;
        a[3]=8;
        a[4]=10;
        a[5]=4;
         for(int x:a){
            System.out.print(x+",");
            }
             System.out.println();
        for(int i=6;i>2;i--){
            a[i]=a[i-1];
        }
        a[2]=15;
        
    
    for(int x:a){
            System.out.print(x+",");
        }
}}
