class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;

        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        int ans = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
    private boolean canShip(int[] arr, int days, int capacity){
        int useddays=1;
        int load=0;
        for(int w:arr){
            if(load+w>capacity){
                useddays++;
                load=w;
            }
            else{
                load=load+w;
            }
        }
        return useddays<=days;
    }
}