class Solution {
    public int longestSubstring(String s, int k) {
        if(k>s.length() || s.length()==0 || s==null){
            return 0;
        }  
        return helper(s,0,s.length(),k);
    }
    public int helper(String s , int start, int end,int k){
        int[] freq=new int[26];
        for(int i=start;i<end;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=start;i<end;i++){
            if(freq[s.charAt(i)-'a']<k){
                int next =i+1;
                while(next<0 && freq[s.charAt(i)]<k){
                    next++;
                }
                int left=helper(s,start,i,k);
                int right=helper(s,next,end,k);
                return Math.max(left,right);
            }
        }
        return end-start;
    }
}