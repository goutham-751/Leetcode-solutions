class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
               minlen=Math.min(minlen,i-left+1);
               sum=sum-nums[left];  
               left++; 
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}