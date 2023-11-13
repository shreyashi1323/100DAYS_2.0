class Solution {
    public int firstElementKTime(int[] A, int N, int K) {
        int[] countArray = new int[201]; 

        for (int i = 0; i < N; i++) {
            countArray[A[i]]++;

            if (countArray[A[i]] == K) {
                return A[i];
            }
        }

        return -1;
    }
}
