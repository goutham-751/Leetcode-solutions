class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int left=1;
        int ans=max;
        while(left<=max){
            int mid=left+(max-left)/2;
            if(canfinish(piles,h,mid)){
                ans=mid;
                max=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean canfinish(int[] arr,int h,int k){
        long hours=0;
        for(int i:arr){
            hours=hours+((i+k-1)/k);
        }
        return hours<=h;
    }
}