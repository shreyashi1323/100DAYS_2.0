


class Solution {
    public static ArrayList<Integer> duplicates(int a[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = a[i] % n;
            a[index] += n;
        }

        for (int i = 0; i < n; i++) {
            if ((a[i] / n) >= 2) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            result.sort(null);
        }

        return result;
    }
}

