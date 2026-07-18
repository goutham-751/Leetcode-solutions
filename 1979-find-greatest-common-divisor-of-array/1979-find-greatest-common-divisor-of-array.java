class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=1000;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);

        }
        return gcd(min,max);

    }
    public int gcd(int a,int b){
        return (b == 0) ? a : gcd(b, a % b);
    }
}