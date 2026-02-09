class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int count=0;
        int product=1;
        if(k<=1) return 0;
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
            while(product>=k){
                product=product/ nums[left];
                left++;
            }
            count=count+(i-left+1);
        }
        return count;
    }
}