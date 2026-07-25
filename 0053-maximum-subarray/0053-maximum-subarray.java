class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        for(int num:nums){
            currentsum+=num;
            if(currentsum>max){
                max=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        return max;
    }
}