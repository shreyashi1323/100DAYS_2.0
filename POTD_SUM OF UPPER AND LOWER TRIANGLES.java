class Solution {
    public List<Integer> sumTriangles(List<List<Integer>> matrix, int n) {
        int us = 0, ls = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    us += matrix.get(i).get(j);
                } else if (i > j) {
                    ls += matrix.get(i).get(j);
                } else {
                    us += matrix.get(i).get(j);
                    ls += matrix.get(i).get(j);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(us);
        result.add(ls);
        return result;
    }
