class Solution {
    public int minDist(int[] a, int n, int x, int y) {
        int lastX = -1;
        int lastY = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                if (lastY != -1) {
                    int currentDistance = i - lastY;
                    if (currentDistance < minDistance) {
                        minDistance = currentDistance;
                    }
                }
                lastX = i;
            } else if (a[i] == y) {
                if (lastX != -1) {
                    int currentDistance = i - lastX;
                    if (currentDistance < minDistance) {
                        minDistance = currentDistance;
                    }
                }
                lastY = i;
            }
        }

        if (lastX == -1 || lastY == -1) {
            return -1; // If either x or y does not exist in the array, return -1
        }

        return minDistance;
}}


