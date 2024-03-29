public class pivot{
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (curr == sum) {
                return i;
            }
            curr += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index: " + pivotIndex(nums));
    }
}
