class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int maxlength=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxlength=Math.max(i-left+1,maxlength);
        }
        return maxlength;
    }
}