class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[128];
        int len=s.length();
        int left=0;
        int max=0;
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
            while(freq[s.charAt(i)]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}