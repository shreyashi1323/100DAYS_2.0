

//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        
        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
       
    }
}
