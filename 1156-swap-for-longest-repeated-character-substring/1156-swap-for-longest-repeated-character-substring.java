class Solution {
    public int maxRepOpt1(String text) {
        int maxlen=0;
        int[] freq=new int[26];
        for(char ch:text.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch='a';ch<='z';ch++){
            int left=0;
            int count=0;
            for(int right=0;right<text.length();right++){
                if(text.charAt(right)==ch){
                    count++;
                }
                while((right-left+1)-count >1){
                    if(text.charAt(left)==ch){
                        count--;
                    }
                    left++;//shrink the window
                }
                maxlen=Math.max(maxlen,Math.min(right-left+1,freq[ch-'a']));
            }
        }
        return maxlen;
    }
    
}