import java.util.*;
public class overl {
    static float area(float l,float b){
        return l*b;
    }
    static float area(float radius){
        return (float)Math.PI*radius*radius;
    }
    static float area(float a,float b,float distance){
        return (a+b)*distance/2f;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the parameters of rectange");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("enter the value of radius");
        int r=sc.nextInt();
        System.out.println("area of rectangle "+area(l,b));
        System.out.println("area of circle "+area(r));

        

    }

}
