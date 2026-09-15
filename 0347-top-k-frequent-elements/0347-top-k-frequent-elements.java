class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->Integer.compare(b.getValue(),a.getValue()));
        pq.addAll(map.entrySet());
        for(int i=0;i<k;i++){
            result[i]=pq.poll().getKey();
        }   
        return result;

    }
}