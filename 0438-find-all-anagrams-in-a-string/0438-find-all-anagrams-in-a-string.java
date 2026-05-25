class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int left=0;
        if(p.length()>s.length()){
            return result;
        }
        for(int i=0;i<p.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        int k=p.length();
        if(Arrays.equals(freq1,freq2)){
            result.add(0);
        }

        for(int i=k;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freq1,freq2)){
                result.add(i-k+1);
            }
        }
        return result;
    }
}