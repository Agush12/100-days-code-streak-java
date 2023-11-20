import java.util.*;
public class radixmatch {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String n=sc.next();
        if(n.matches("[01]+")){
            System.out.println("binary");
        }
        else if(n.matches("[0-8]+")){
            System.out.println("octal");
        }
        else if(n.matches("[0-9]+")){
            System.out.println("decimal");
        }
        else if(n.matches("[0-9A-F]+")){
            System.out.println("hexadecimal");
        }

    }
    
}
