class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        int count=0;
        while(i<first.length()){
            if(first.charAt(i)==last.charAt(i)){
                count++;
                i++;
            }
            else{
                break;
            }
        }
        return first.substring(0,count);
    }
}