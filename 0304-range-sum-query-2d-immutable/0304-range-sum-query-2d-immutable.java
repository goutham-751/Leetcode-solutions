class NumMatrix {
    int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefixSum = new int[m][n];
        prefixSum[0][0] = matrix[0][0];
        for (int j = 1; j < n; j++) {
            prefixSum[0][j] = prefixSum[0][j - 1] + matrix[0][j];
        }

        for (int i = 1; i < m; i++) {
            prefixSum[i][0] = prefixSum[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                prefixSum[i][j] = matrix[i][j]
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefixSum[row2][col2];
        int top = (row1 > 0) ? prefixSum[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? prefixSum[row2][col1 - 1] : 0;
        int corner = (row1 > 0 && col1 > 0) ? prefixSum[row1 - 1][col1 - 1] : 0;
        return total - top - left + corner;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */