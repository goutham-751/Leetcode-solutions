class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                freq2[ch-'A']++;
            }
            else{
                freq1[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq1[i]==0 && freq2[i]==0) continue;
            else if(freq1[i]>=1 && freq2[i]>=1) count++;
        }
        return count;
    }
}