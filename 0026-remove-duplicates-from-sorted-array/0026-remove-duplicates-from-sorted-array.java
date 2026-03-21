class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int i=0;
        if(n==0) return 0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;//move forward until u get a unique element , i keeps the track of unique element whereas j scans the array for duplicates and unique values
                arr[i]=arr[j];
            }
            
        }
        return i+1;
        
    }
}