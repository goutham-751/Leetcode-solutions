class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}