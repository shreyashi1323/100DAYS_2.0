class Solution {
    int columnWithMaxZeros(int arr[][], int n) {
        int maxZeros = 0; 
        int columnWithMax = -1; 

        for (int j = 0; j < n; j++) {
            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    zeroCount++;
                }
            }

            if (zeroCount > maxZeros) {
                maxZeros = zeroCount;
                columnWithMax = j;
            }
        }

        return columnWithMax;
    }
}