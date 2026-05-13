class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left =0;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            int area=width*h;
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}