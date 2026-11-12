class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            int temp = target - nums[i];
            if (list.containsKey(temp)) {
                ans[0] = list.get(temp);
                ans[1] = i;
                break;
            } else {
                list.put(nums[i], i);
            }
        }
        return ans;
    }
}