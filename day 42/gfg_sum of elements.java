class Solution {
    int sumOfMatrix(int n, int m, int[][] Grid) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=sum+Grid[i][j];
            }
        }
        return sum;
    }
}
