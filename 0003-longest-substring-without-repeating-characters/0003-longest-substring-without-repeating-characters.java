class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[128];
        int length=s.length();
        int left=0;
        int maxlen=0;
        for(int i=0;i<length;i++){
            freq[s.charAt(i)]++;
            while(freq[s.charAt(i)]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
