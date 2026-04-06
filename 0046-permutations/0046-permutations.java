class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        solve(nums,new boolean[nums.length],new ArrayList<>(),result);
        return result;
    }
    public void solve(int[] nums,boolean[] visited,List<Integer>current,List<List<Integer>> result){
        //base condition 
        if(nums.length==current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            current.add(nums[i]);
            solve(nums,visited,current,result);
            current.remove(current.size()-1);
            visited[i]=false;
        }

    }
}