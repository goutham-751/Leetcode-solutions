class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int leftsum=0;
        int rightsum=0;
        for(int num:nums){
            rightsum+=num;
        }
        for(int i=0;i<nums.length;i++){
            rightsum=rightsum-nums[i];
            ans[i]=Math.abs(rightsum-leftsum);
            leftsum=leftsum+nums[i];
        }
        return ans;
    }
}