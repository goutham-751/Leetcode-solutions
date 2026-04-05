class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, new ArrayList<>(),result, target);
        return result;
    }
    public void solve(int index,int[] nums, List<Integer> current,List<List<Integer>> result, int target ){
        if(index==nums.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(nums[index]<=target){
            current.add(nums[index]);
            solve(index,nums,current,result,target-nums[index]);
            current.remove(current.size()-1);
        }
        solve(index + 1, nums, current, result ,target);
    }


}