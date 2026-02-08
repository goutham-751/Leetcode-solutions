class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int count=0;
        if(sum >= k*threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            int avg=(sum/k);
            if(avg>=threshold){
                count++;
            }
        }
        return count;

    }
}