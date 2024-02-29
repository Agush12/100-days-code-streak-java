import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
            h.add(nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (h.contains(nums2[i])) {
                a.add(nums2[i]);
                h.remove(nums2[i]);
            }
        }
        
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        
        return arr;
    }
}
