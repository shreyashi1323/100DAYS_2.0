

class Solution {
    boolean isRotated(String str1, String str2) {
        int n = str1.length();

        // Check if strings have the same length
        if (n != str2.length()) {
            return false;
        }

        // Check if str2 is a rotated version of str1 (clockwise)
        String clockwiseRotation = str1.substring(n - 2) + str1.substring(0, n - 2);
        if (clockwiseRotation.equals(str2)) {
            return true;
        }

        // Check if str2 is a rotated version of str1 (anti-clockwise)
        String anticlockwiseRotation = str1.substring(2) + str1.substring(0, 2);
        return anticlockwiseRotation.equals(str2);
    }
}
