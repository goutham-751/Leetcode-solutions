class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        maxcount=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
    public boolean isvowel(char c){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') return true;
        return false;
    }
}