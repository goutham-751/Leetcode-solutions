class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,nums,new ArrayList<>(),0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,int[] nums,List<Integer> current,int index){
        result.add(new ArrayList<>(current));
        if(index==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);//make the choice
            backtrack(result,nums,current,i+1);
            current.remove(current.size()-1);
        }
    }

}