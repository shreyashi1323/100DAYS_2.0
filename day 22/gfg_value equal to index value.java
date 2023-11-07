

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) { // Arrays are 0-based, indices are 1-based
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
