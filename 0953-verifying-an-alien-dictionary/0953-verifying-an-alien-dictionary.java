class Solution {
    int[] freq;
    public boolean isAlienSorted(String[] words, String order) {
        freq=new int[26];
        for(int i=0;i<26;i++){
            freq[order.charAt(i)-'a']=i;
        }
        for(int i=1;i<words.length;i++){
            if(compare(words[i-1],words[i])>0){
                return false;//it is not sorted;
            }
        }
        return true;

    }
    public int compare(String word1,String word2){
        int i=0;
        int j=0;
        int compareval=0;
        while(i<word1.length() && j<word2.length() && compareval==0){
            compareval=freq[word1.charAt(i)-'a']-freq[word2.charAt(j)-'a'];
            i++;
            j++;
        }
        if(compareval==0){
            return word1.length()-word2.length();
        }
        else{
            return compareval;
        }
    }
}