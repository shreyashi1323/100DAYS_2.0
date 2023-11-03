class Solution {
    boolean checkTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
