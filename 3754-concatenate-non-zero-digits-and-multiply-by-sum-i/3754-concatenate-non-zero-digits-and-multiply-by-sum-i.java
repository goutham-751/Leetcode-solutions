class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        int multiplier=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                x=digit*multiplier+x;
                multiplier=multiplier*10;
                sum+=digit;
            }
            n=n/10;
        }
        return (long) x*sum;
    }
}