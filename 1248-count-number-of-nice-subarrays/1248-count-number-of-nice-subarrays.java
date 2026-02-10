class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int x){
        int left=0;
        int count=0;
        int oddcount=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                oddcount++;
            }
            while(oddcount>x){
                if(nums[left]%2==1){
                     oddcount--;
                }
                left++;   
            }
            count+=i-left+1;
        }
        return count;

    }
}