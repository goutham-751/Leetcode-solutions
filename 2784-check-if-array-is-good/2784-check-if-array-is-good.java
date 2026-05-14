class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = 0;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                count++;
            }
        }

        if (count != 2) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[n - 1] == max && nums[n - 2] == max;
    }
}