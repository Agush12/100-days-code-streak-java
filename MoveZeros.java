import java.util.Arrays;

public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeros(nums1);
        System.out.println(Arrays.toString(nums1)); // Should print [1, 3, 12, 0, 0]

        int[] nums2 = {0, 0, 1, 0, 9, 8, 4, 0, 0, 2};
        moveZeros(nums2);
        System.out.println(Arrays.toString(nums2)); // Should print [1, 9, 8, 4, 2, 0, 0, 0, 0, 0]
    }
}


