class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=getwave(i);
        }
        return ans;
    }
    public int getwave(int num){
        int[] arr=new int[10];
        int length=0;
        while(num>0){
            arr[length++]=num%10;
            num=num/10;
        }
        if(length<3){
            return 0;
        }
        int count=0;
        for(int i=1;i<length-1;i++){
            if((arr[i-1]<arr[i] && arr[i]>arr[i+1]) || arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                count++;
            } 
        }
        return count;
        
    }
}