class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int k1=1;
        int k2=1;
        for(int i=2;i<n;i++){
            if(arr1[k1-1]>=arr2[k2-1]){
                arr1[k1]=nums[i];
                k1++;
            }
            else{
                arr2[k2]=nums[i];
                k2++;
            }
        }
        int i=0;
        int j=0;
        int k=0;
        int[] result=new int[k1+k2];
        while(i<k1){
            result[k++]=arr1[i++];
        }
        while(j<k2){
            result[k++]=arr2[j++];
        }
        return result;
        
    }
}