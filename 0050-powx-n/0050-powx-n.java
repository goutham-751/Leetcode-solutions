class Solution {
    public double myPow(double x, int n) {
        // Convert n to long to prevent overflow when n = Integer.MIN_VALUE (-2147483648)
        long N = n;
        
        // Handle negative exponent
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        return helper(x, N);
    }

    private double helper(double x, long n) {
        // Base Case
        if (n == 0) {
            return 1.0;
        }

        // Recursive call: calculate x^(n/2) ONCE to save work
        double half = helper(x, n / 2);

        // If n is EVEN
        if (n % 2 == 0) {
            return half * half;
        } 
        // If n is ODD
        else {
            return x * half * half;
        }
    }
}