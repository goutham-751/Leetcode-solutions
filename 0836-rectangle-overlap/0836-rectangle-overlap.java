class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return intersection(rec1,rec2);
            
    }
    public boolean intersection(int[] rect1,int[] rect2){
        int ax1 = rect1[0], ay1 = rect1[1], ax2 = rect1[2], ay2 = rect1[3];
        int bx1 = rect2[0], by1 = rect2[1], bx2 = rect2[2], by2 = rect2[3];
        int width=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int height=Math.min(ay2,by2)-Math.max(ay1,by1);
        return width > 0 && height > 0;
    }
}