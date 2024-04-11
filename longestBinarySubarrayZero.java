import java.util.HashMap;
public class longestBinarySubarrayZero {
    public static int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int res=0;
        int sum=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0){
                res= i+1;
            }
            if(m.containsKey(sum)){
                res=Math.max(i-m.get(sum),res);
            }
            if(m.containsKey(sum)==false){
                m.put(sum,i);
            }

        }
        return res;
        
    }

    public static void main(String args[]){
        int a[]={0,1,0,1};
       int c= findMaxLength(a);
    }
    
}
