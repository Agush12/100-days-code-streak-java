import java.util.*;

public class permute {
    static String swap(String s, int i, int j) {
       char charArray[]=s.toCharArray();
       char temp;
       temp=charArray[i];
       charArray[i]=charArray[j];
       charArray[j]=temp;
       return new String(charArray);

    }

    static void perm(String s, int i) {
        if (i == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
           s= swap(s, i, j);
            perm(s, i + 1);
          s=  swap(s, j, i);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        int i = 0;
        
        perm(str, i);
    }
}
