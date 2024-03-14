import java.util.*;
public class romToInt{
    static int convert(String s){
        int ans=0;
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for(int i=0;i<s.length()-1;i++){
            if(romanMap.get(s.charAt(i+1))>romanMap.get(s.charAt(i))){
                ans-=romanMap.get(s.charAt(i));

            }
            else if(romanMap.get(s.charAt(i+1))<=romanMap.get(s.charAt(i))){
                ans+=romanMap.get(s.charAt(i));
            }
        }
        ans+=romanMap.get(s.charAt(s.length()-1));
        
        
        return ans;
    }

public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    System.out.println(convert("MCMXCIV"));
}}