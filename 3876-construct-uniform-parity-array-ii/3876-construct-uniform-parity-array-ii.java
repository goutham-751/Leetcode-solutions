class Solution {
    public boolean uniformArray(int[] nums) {
        int n=nums.length;
        int paritycountodd=0;
        int paritycounteven=0;
        int minodd=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                paritycounteven++;
            }
            else{
                paritycountodd++;
            }
        }
        if(paritycountodd==n || paritycounteven==n ){
            return true;
        }//first case 
        else {//second case
            for(int num:nums){
                if(num%2==1){
                    minodd=Math.min(minodd,num);
                }
            }
            for(int num:nums){
                if(num<minodd){
                   return false; 
                }
            }
            if(minodd==Integer.MAX_VALUE){
                return false;
            }
        }    
        return true;
    }
}