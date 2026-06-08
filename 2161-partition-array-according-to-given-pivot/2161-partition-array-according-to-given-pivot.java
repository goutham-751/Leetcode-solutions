class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;

        for (int num : nums) {
            if (num < pivot) {
                result[i++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                result[i++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[i++] = num;
            }
        }

        return result;
    }
}