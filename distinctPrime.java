import java.util.*;

class Solution {
    public int[] fact(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            a.add(3);
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                a.add(i);
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                a.add(i + 2);
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            a.add(n);
        }
        int arr[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }

    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int arr[] = fact(nums[i]);
            for (int j = 0; j < arr.length; j++) {
                h.add(arr[j]);
            }
        }
        return h.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10, 15, 21};
        int distinctPrimeFactorsCount = solution.distinctPrimeFactors(nums);
        System.out.println(distinctPrimeFactorsCount);
    }
}
