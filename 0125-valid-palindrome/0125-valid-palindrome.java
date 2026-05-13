class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        char[] sc=s.toCharArray();
        int left=0;
        int right=sc.length-1;
        while(left<right){
            if((sc[left]!=sc[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}