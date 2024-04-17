import java.util.ArrayList;
import java.util.List;
class anagramSearch {
    public boolean areSame(int CP[],int CT[]){
        for(int i=0;i<CP.length;i++){
            if(CP[i]!=CT[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> li=new ArrayList<>(256);
        if(s.length()<p.length()){
            return li;
        }
        int CS[]=new int[256];
        int CP[]=new int[256];

        for(int i=0;i<p.length();i++){
            CS[s.charAt(i)]++;
            CP[p.charAt(i)]++;
        }int i;
        for(i=p.length();i<s.length();i++){
            if(areSame(CS,CP)){
                li.add(i-p.length());
            }
            CS[s.charAt(i-p.length())]--;
            CS[s.charAt(i)]++;
        }
        if(areSame(CS,CP)){
            li.add(i-p.length());
        }
        return li;
        
    }
    public static void main(String args[]){
        String s="abcdeabc";
        String p="ba";
        

    }
}