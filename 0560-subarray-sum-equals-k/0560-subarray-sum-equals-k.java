class Solution {
    public int subarraySum(int[] nums, int k) {
        //core idea:prefix[j+1]-prefix[i]=k which is also equal to prefix[i]=prefix[j+1]-k;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int currentsum=0;
        int count=0;
        for(int num:nums){
            currentsum=currentsum+num;
            count=count+map.getOrDefault(currentsum-k,0);//check if the currentsum-k exist , if not return 0;
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);//record this currentsum
        }
        return count;
        
    }
}