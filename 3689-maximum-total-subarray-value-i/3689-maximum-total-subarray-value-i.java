class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        long result=(long)(max-min)*k;
        return result;
    }
}