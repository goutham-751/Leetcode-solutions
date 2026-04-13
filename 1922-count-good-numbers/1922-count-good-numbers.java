class Solution {
    static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=n-odd;
        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }
    public long power(long base,long exp){
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}