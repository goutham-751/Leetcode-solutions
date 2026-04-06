class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        solve(0,nums,target,new ArrayList<>(),result);
        return result;
    }
    public void solve(int index,int[] nums,int target,List<Integer>current,List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;//breaks the condition
            current.add(nums[i]); 
            solve(i+1,nums,target-nums[i],current,result);
            current.remove(current.size()-1);
        }

    }
}