class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        if(s.length()<=1) return s ;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder firsthalf=new StringBuilder();
        char middleChar = '\0';
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            int halfcount=freq[i]/2;
            for(int k=0;k<halfcount;k++){
                firsthalf.append(ch);
            }
            if (freq[i] % 2 != 0) {
                middleChar = ch;
            }
            
        }
        StringBuilder result = new StringBuilder(firsthalf);
        if (middleChar != '\0') {
            result.append(middleChar);
        }
        result.append(new StringBuilder(firsthalf).reverse());
        
        return result.toString();

    }
}