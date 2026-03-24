class Solution {
    public void sortColors(int[] arr) {
        int high=arr.length-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public void swap(int arr[],int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}