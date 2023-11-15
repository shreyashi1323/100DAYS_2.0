class Solution {
    int missingNumber(int array[], int n) {
        
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of the given array
        int actualSum = 0;
        for (int i=0;i<=array.length;i++) {
            actualSum += array[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
 

    }
}
