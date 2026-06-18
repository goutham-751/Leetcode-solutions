class Solution { 
    public int totalMoney(int n) { 
        int remaining = n % 7; 
        int complete = n / 7; 
        int ans = 0; 
        
        if (n < 7) {
            ans = n * (n + 1) / 2; 
        } else { // Changed from if(n>7) to handle n >= 7 correctly
            ans = complete * 28 + (7 * (complete - 1) * complete / 2) + (remaining * complete) + (remaining * (remaining + 1) / 2); 
        }
        
        return ans; 
    } 
}
