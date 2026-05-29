class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            min=Math.min(min,calcsum(num));
        }
        return min;
    }
    public int calcsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
}