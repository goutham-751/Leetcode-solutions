class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length==0) return 0;
        int longest=1;
        for(int x:set){
            if(!set.contains(x-1)){
                int current=x;
                int length=1;
                while(set.contains(current+1)){
                    length++;
                    current=current+1;
                }
                longest=Math.max(longest,length);
            }
            
        }
        return longest;
    }
}