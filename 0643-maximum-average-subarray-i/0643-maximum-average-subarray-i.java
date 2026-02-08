class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            maxsum=Math.max(sum,maxsum);
        }
        return (double) maxsum/k;
    }

}