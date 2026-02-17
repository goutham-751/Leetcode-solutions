class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int left=0;
        int count=0;
        int total=0;
        int n=nums.length;
        if(n<3){
            return 0;
        }
        for(int right=2;right<n;right++){
            if(nums[right]-nums[right-1]==nums[right-1]-nums[right-2]){
                count++;
                total+=count;
            }
            else{
                count=0;
            }
        }
        return total;
    }
}