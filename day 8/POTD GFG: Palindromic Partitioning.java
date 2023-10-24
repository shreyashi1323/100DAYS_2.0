class Solution{
    static int palindromicPartition(String str)
    {
        int n = str.length();
        int[] minCuts = new int[n];
        boolean[][] isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            minCuts[i] = i; // Maximum possible cuts
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == str.charAt(j) && (i - j < 2 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                    minCuts[i] = (j == 0) ? 0 : Math.min(minCuts[i], minCuts[j - 1] + 1);
                }
            }
        }

        return minCuts[n - 1];
    }
}
