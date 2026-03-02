class Solution {
    public boolean isPowerOfFour(int n) {
        /*if(n==0) return false;
        if(n==1) return true;
        return (n & n-1)==0 && (n-1 %3)==0;*/
        if(n<1) return false;
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}