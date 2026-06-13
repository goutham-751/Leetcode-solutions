class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            int total=0;
            for(char c:word.toCharArray()){
                total+=weights[c-'a'];
            }
            int remainder=total%26;
            char mapped=(char) ('z'-remainder);
            sb.append(mapped);
        }
        return sb.toString();
    }
}