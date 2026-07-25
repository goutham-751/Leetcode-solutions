class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
        }

        return max;
    }
}