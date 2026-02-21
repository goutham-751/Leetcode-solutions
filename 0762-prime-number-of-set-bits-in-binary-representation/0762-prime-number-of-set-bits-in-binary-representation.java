class Solution {
    public int countPrimeSetBits(int left, int right) {
        int finalcount=0;
        for(int i=left;i<=right;i++){
            int count=Integer.bitCount(i);
            if(isPrime(count)){
                finalcount++;
            }

        }
        return finalcount;
        
    }

    public boolean isPrime(int num){
        boolean flag=true;
        if(num==1 | num==0){
            flag=false;
        }
        if(num==2 | num==3){
            flag=true;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
            }
        }
        return flag;
    }
}