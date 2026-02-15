class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] result=new int[n];
        for(int right=0;right<n;right++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=code[(right+j)%n];
                    result[right]=sum;
                }
            }
            else if(k<0){
                for (int j = 1; j <= -k; j++) {
                    sum += code[(right - j + n) % n];
                    result[right]=sum;
                }
            }
            else if(k==0){
                return result;
            }
        }
        return result;
    }
    
}