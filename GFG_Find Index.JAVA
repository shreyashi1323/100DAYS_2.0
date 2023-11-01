class Solution
{ 
        public static int[] findIndex(int a[], int N, int key) {
        int start = -1; // Initialize start index to -1
        int end = -1;   // Initialize end index to -1

        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                if (start == -1) {
                    start = i; // Set start index when key is found for the first time
                }
                end = i; // Update end index as long as key is found
            }
        }

        int[] result = new int[2];
        result[0] = start; // Store start index
        result[1] = end;   // Store end index
        return result;
}}
