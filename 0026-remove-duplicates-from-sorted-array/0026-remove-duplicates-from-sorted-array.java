class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;//move until u get a unique element
                arr[j]=arr[i];
            }
        }
        return j+1;
        
    }
}