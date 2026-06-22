class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(char c:text.toCharArray()){
            freq[c-'a']++;
        }
        int count=Integer.MAX_VALUE;
        freq['l'-'a']/=2;
        freq['o'-'a']/=2;
        for(char c:"balon".toCharArray()){
            count=Math.min(count,freq[c-'a']);
        }    
        return count;    
        



    }
}