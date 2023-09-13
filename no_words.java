import java.util.*;
public class no_words {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    String str="";
    int n =sc.nextInt();
    for(int i=0;n>0;i++){
        int r=n%10;
        str=str+r;
        n=n/10;

    }
    for(int i=str.length()-1;i>=0;i--){
        char c=str.charAt(i);
        switch(c){
            case '0': System.out.print(" zero");
            break;
            case '1': System.out.print(" one");
            break;
            case '2': System.out.print(" two");
            break;
            case '3': System.out.print(" three");
            break;
            case '4': System.out.print(" four");
            break;
            case '5': System.out.print(" five");
            break;
            case '6': System.out.print(" six");
            break;
            case '7': System.out.print(" seven");
            break;
            case '8': System.out.print(" eight");
            break;
            case '9': System.out.print(" nine");
            break;
        }

    }



    }
    
}
