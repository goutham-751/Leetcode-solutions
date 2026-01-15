class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        while(right < n){
            if(left==right){
                right++;
                continue;
            }
            int diff=nums[right]-nums[left];
            if(diff==k){
                count++;
                int leftVal = nums[left];
                int rightVal = nums[right];

                while (left < n && nums[left] == leftVal) left++;
                while (right < n && nums[right] == rightVal) right++;
            }
            else if(diff > k){
                left++;
            }
            else {
                right++;
            }
        }
        return count;

    }
}