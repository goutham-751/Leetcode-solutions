class Solution {
    public int numberOfSubstrings(String s) {
        int[] count=new int[3];
        int result=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0 ){
                result=result+s.length()-i;
                count[s.charAt(j)-'a']--;
                j++;
            }
        }
        return result;

    }
}