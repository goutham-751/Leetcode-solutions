class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while (true) { 
            if (product(i) % t == 0) { 
                return i; 
            }
            i++;
        } 
    }
    public int product(int n){
        int num=n;
        int pro=1;
        while(num>0){
            int digit=num%10;
            pro=pro*digit;
            num=num/10;
        }
        return pro;
    }
}