import java.util.*;
public class url {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the url");
        String url=sc.nextLine();
        String protocol =url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("http");
        }
        else if(protocol.equals("ftp")){
            System.out.println("ftp");
        }
        else if(protocol.equals("https")){
            System.out.println("https");
        }
        String ext=url.substring(url.lastIndexOf(".")+1,url.length());
         if(ext.equals("com")){
            System.out.println("commercial");
        }
        else if(ext.equals("org")){
            System.out.println("organisation");
        }
        else if(ext.equals("net")){
            System.out.println("network");
        }


    }
    
}
