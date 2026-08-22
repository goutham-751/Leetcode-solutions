class Solution {
    public boolean checkDivisibility(int n) {
        int ans=sum1(n)+prod1(n);
        return (n%ans==0);
    }
    public int sum1(int n){
        int num=n;
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        return sum;
    }
    public int prod1(int n){
        int product=1;
        while(n!=0){
            product=product*(n%10);
            n=n/10;
        }
        return product;
    }
}