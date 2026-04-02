class Solution {
    public int search(int[] arr, int target) {
        int length=arr.length;
        int low=0;
        int high=length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid]){//left sorted
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;//right sorted
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=search(arr,target);
        System.out.println(result);
    }

}