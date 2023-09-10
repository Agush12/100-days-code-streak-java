import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("options are-");
        System.out.println("ADD");
         System.out.println("SUB");
          System.out.println("MUL");
           System.out.println("DIV");
            System.out.println("Enter the 2 numbers-");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter the option");
             String option=sc.nextLine();
             option=option.toUpperCase();
             switch(option)
             {
                case "ADD": System.out.println("sum is "+(a+b));
                break;
                case "SUB": System.out.println("difference is "+(a-b));
                break;
                case "MUL": System.out.println("multiplication is "+(a*b));
                break;
                case "DIV": System.out.println("division is "+(a/b));
             }



    }
    
}
