

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> result = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = r - 1;
        int ec = c - 1;

        while (sr <= er && sc <= ec) {
            // Print the top row
            for (int i = sc; i <= ec; i++) {
                result.add(matrix[sr][i]);
            }
            sr++;

            // Print the rightmost column
            for (int i = sr; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            ec--;

            // Print the bottom row
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    result.add(matrix[er][i]);
                }
                er--;
            }

            // Print the leftmost column
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    result.add(matrix[i][sc]);
                }
                sc++;
            }
        }

        return result;
    }
}
