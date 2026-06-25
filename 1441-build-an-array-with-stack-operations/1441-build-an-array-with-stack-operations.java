class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<>();
        int current=0;
        for(int i=1;i<=n;i++){
            if (current>= target.length) {
                break;
            }
            result.add("Push");
            if(target[current]==i){
                current++;
            }
            else if(current!=i){
                result.add("Pop");
            }
        }
        return result;
    }
}