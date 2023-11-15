class Solution {
    int missingNumber(int array[], int n) {
        
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of the given array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
 

    }
}
