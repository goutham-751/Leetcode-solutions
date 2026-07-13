class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=8;i++){
            int current=i;
            for(int j=i+1;j<=9;j++){
                current=current*10+j;
                if(current>=low && current<=high){
                    list.add(current);
                }
                if(current>high){
                    break;
                }
            }
        }
        Collections.sort(list);
        return list;

    }
}