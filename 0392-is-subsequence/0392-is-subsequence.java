class Solution {
    public boolean isSubsequence(String s, String t) {
        int lens=s.length();
        int lent=t.length();
        int i=0;
        int j=0;
        while(i<lens && j<lent){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
            
        }
        return i==lens;
    }

}