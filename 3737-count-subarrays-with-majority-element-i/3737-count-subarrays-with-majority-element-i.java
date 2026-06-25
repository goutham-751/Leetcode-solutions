class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int subcount=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    count++;
                }
                if(count*2>j-i+1){
                    subcount++;
                }
            }

        }
        return subcount;

    }
}