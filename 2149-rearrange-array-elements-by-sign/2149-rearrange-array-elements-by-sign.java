class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        if(n<2) return nums;
        /*int[] positive=new int[n/2];
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
        }*/
        int[] ans=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;


    }
}