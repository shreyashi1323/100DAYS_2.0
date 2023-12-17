class Solution {
    public boolean isIsomorphic(String s, String t) {
     if (s.length() != t.length()) {
            return false;
        }

        int[] sLastPos = new int[256]; // Assuming ASCII characters
        int[] tLastPos = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Compare the last positions where the characters occurred
            if (sLastPos[sChar] != tLastPos[tChar]) {
                return false;
            }

            // Update last positions for the characters
            sLastPos[sChar] = i + 1;
            tLastPos[tChar] = i + 1;
        }

        return true;
    }
}
