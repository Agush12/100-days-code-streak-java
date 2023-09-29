class circle{
    private int radius;
    public circle(){
        radius=1;
    }
    public circle(int radius){
        this.radius=radius;
    }
    public int getRadius()
    {return radius;}
    public void setRadius(int r)
    {radius =r;}
    public double area()
    {
        return Math.PI*radius*radius;
    }

}
class arr_obj {
    public static void main(String args[]){
        circle c[]= new circle[3];
        c[0]= new circle();
        c[1] = new circle(10);
        c[2]= new circle(0);
        System.out.println("area of c[0] circle is "+c[0].area());
        System.out.println("area of c[1] circle is "+c[1].area());
        System.out.println("area of c[2] circle is "+c[2].area());
        c[2].setRadius(4);
        System.out.println("area of new c[2] circle is "+c[2].area());

    }
    
}