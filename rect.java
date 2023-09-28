class rectangle{
    private double length;
    private double breadth;
    public rectangle(){
        length=1;
        breadth=1;
    }
    public rectangle(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public void setLength(double l){
      if(l>0){
        length=l;
      }
      else{
        length=-l;
      }
    }
     public void setBreadth(double b){
      if(b>0){
        breadth=b;
      }
      else{
        breadth=-b;
      }
      
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double area(){
     return length*breadth;
   }
   public double perimeter(){
    return 2*(length+breadth);
   }
   public boolean isSquare()
   {return length==breadth;}
  
 

}
public class rect {
    public static void main(String args[])
    {
        rectangle r1= new rectangle(-10,5);
      
    System.out.println("length is "+r1.getLength()+" breadth is "+r1.getBreadth());
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
   

    
}}
