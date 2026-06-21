class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            if(sum + costs[i] <= coins){
                sum=sum+costs[i];
                result=result+1;
            }
        }
        return result;
    }
}