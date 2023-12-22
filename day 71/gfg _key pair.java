class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);

     
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
               
                return true;
            } else if (sum < x) {
             
                left++;
            } else {
               
                right--;
            }
        }

  
        return false;
    }
}
