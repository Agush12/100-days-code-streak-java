class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
                return mid;
            } else if (mid == 0 || nums[mid] <= nums[mid + 1]) {
                low = mid + 1;
            } else if (mid == nums.length - 1 || nums[mid] <= nums[mid - 1]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = solution.findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex);
    }
}
