class NumArray {
    int[] prefix_sum;
    public NumArray(int[] nums) {
        int n=nums.length;
        prefix_sum=new int[n+1];
        for(int i=0;i<n;i++){
            prefix_sum[i+1]=prefix_sum[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix_sum[right+1]- prefix_sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */