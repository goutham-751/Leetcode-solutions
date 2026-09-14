class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] visited=new  boolean[nums.length];
        Arrays.sort(nums);
        solve(result,new ArrayList<>(),nums,visited);
        return result;
    }
    public void solve(List<List<Integer>> result,List<Integer> current,int[] nums,boolean[] visited){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) {
                continue;
            }
            visited[i]=true;
            current.add(nums[i]);//make the choice 
            solve(result,current,nums,visited);
            current.remove(current.size()-1);//backtrack
            visited[i]=false;
        }


    }
}