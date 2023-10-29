class Solution
{
    public void countOddEven(int[] A, int N)
    {
      int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount);
    }
}
