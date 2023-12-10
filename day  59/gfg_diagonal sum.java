class Solution {
    public int DiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        // Calculate the sum of the main diagonal
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }

        return sum;
    }
}
