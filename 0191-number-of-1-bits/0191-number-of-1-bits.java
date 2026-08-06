class Solution {
    public int hammingWeight(int n) {
        int count =0;
        String binary=Integer.toBinaryString(n);
        for(char c:binary.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}