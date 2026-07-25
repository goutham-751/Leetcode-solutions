class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[n/2];
        int[] negative=new int[n/2];
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) positive[k++]=nums[i];
            else negative[l++]=nums[i];
        }
        int[] ans=new int[n];
        int i=0;//tracking your pos numbers
        int j=0;//tracking your negative numbers
        int z=0;
        while(i<positive.length && j<negative.length){
            ans[z]=positive[i];
            i++;
            z++;
            ans[z]=negative[j];
            z++;
            j++;
        }
        return ans;


    }
}