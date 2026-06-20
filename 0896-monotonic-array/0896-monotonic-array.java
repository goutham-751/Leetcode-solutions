class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isinc=true;
        boolean isdec=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                isdec=false;
            }
            else if(nums[i-1]>nums[i]){
                isinc=false;
            }
            if(isinc==false && isdec==false){
                break;   
            }
        }
        return isinc || isdec;
    }
}