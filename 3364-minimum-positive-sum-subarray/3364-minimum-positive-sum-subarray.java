class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        for (int length = l; length <= r; length++) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum = sum + nums.get(i);
            }
            if (sum > 0) {
                minsum = Math.min(minsum, sum);
            }
            for (int i = length; i < nums.size(); i++) {
                sum = sum - nums.get(i - length) + nums.get(i);
                if (sum > 0) {
                    minsum = Math.min(sum, minsum);
                }
            }
        }
        return minsum==Integer.MAX_VALUE?-1:minsum;

    }
}