import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1, high = nums.length - 1;
                int sum = -nums[i];
                while(low < high) {
                    int s = nums[low] + nums[high];
                    if(s == sum) {
                        List<Integer> ar = new ArrayList<>();
                        ar.add(nums[i]);
                        ar.add(nums[low]);
                        ar.add(nums[high]);
                        sol.add(ar);
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        high--;
                        low++;
                    }
                    else if(s > sum) {
                        high--;
                    }
                    else if(s < sum) {
                        low++;
                    }
                }
            }
        } 
        return sol;
    }
}
