class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circum(){
        return 2*Math.PI*radius;

    }
    public double perimeter(){
        return circum();
    }
}
public class cls {
    public static void main(String args[]){
        circle c1=new circle();
        c1.radius=10;
        System.out.println("area,circumference and perimeter are respectively as follows--");
        System.out.println(c1.area());
        System.out.println(c1.circum());
        System.out.println(c1.perimeter());
    }
    
}
