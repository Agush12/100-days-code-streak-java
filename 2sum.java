import java.util.*;

class sol {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(target - nums[i])) {
                a.add(h.get(target - nums[i]));
                a.add(i);
                break;
            } else {
                h.put(nums[i], i);
            }
        } 
        
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        
        return result;
    }
}
