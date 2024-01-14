class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int lastWordLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len = 0;
            } else {
                len++;
                lastWordLength = len;
            }
        }

        return lastWordLength;
    }
}
