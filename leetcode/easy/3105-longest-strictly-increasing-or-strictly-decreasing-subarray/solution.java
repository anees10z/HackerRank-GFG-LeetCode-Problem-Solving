class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len = nums.length;
        boolean inc = true;
        boolean dec = true;
        int max = Integer.MIN_VALUE;
        // increasing check
        int j = 1;
        int i = 0;
        while (j < len) {
            if (nums[j] > nums[j - 1]) {
                inc = true;
            } else {
                inc = false;
                max = Math.max(max, j - i);
                i = j;
            }
            j++;
        }
        max = Math.max(max, j - i);
        // decreasing check
        j = 1;
        i = 0;
        while (j < len) {
            if (nums[j] < nums[j - 1]) {
                dec = true;
            } else {
                dec = false;
                max = Math.max(max, j - i);
                i = j;
            }
            j++;
        }
        max = Math.max(max, j - i);
        return max;
    }
}