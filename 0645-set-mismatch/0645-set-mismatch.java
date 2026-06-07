class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result=new int[2];
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=0;i<=n;i++){
            if(freq[i]==0){
                result[1]=i;
            }
            else if(freq[i]==2){
                result[0]=i;
            }
        }
        return result;
    }
}