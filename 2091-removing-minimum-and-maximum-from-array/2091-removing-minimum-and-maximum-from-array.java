class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int ans=0;
        int maxidx=0;
        int minidx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
            if(nums[i]<nums[minidx]){
                minidx=i;
            }
        }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int firstway=right+1;
        int secondway=n-left;
        int thirdway=(left+1)+(n-right);
        ans=Math.min(Math.min(secondway,thirdway),firstway);
        return ans;
    }
}