import java.util.*;
public class findradix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        String num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("number is binary with radix 2");

        }
        else if(num.matches("[0-7]+")){
            System.out.println("number is octal with radix 8");

        }
        else if(num.matches("[0-9]+")){
            System.out.println("number is decimal with radix 10");

        }
        else if(num.matches("[0-7A-F]+")){
            System.out.println("number is hexa with radix 16");

        }
        else{
            System.out.println("number is invalid ");
        }

    }
    
}
