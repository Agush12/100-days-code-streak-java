public class max_varargs {
    static int max(int a,int...b){
        if(b.length==0){ return a;}
        int max=b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        if(a>max){max=a;}
       
        return max;

    }

    public static void main(String args[]){
       System.out.print(max(10)+"\n");
        System.out.print(max(1,2,3,4,5)+"\n");
        System.out.print(max(10,2,3,4,52,1)+"\n");
    }
    
}
