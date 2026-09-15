class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String , Integer> map=new HashMap<>();
        List<String> result=new ArrayList<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((String word1,String word2)->{
            int freq1=map.get(word1);
            int freq2=map.get(word2);
            if (freq1 != freq2) {
                return Integer.compare(freq2, freq1);
            } else {
                return word1.compareTo(word2);
            }
        }
        );
        pq.addAll(map.keySet());
        for(int i=0;i<k;i++){
            result.add(pq.poll());
        }
        return result;
    }
}