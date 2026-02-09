class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int left=0;
        int zc=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zc++;
            }
            while(zc>k){
                if(nums[left]==0){
                    zc--;
                }
                left++;//shrink left                
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;   
    }
}