class Solution {
    public char findTheDifference(String s, String t) {
        int asciiSumS = 0;
        int asciiSumT = 0;

        // Calculate ASCII sum for string s
        for (char c : s.toCharArray()) {
            asciiSumS += (int) c;
        }

        // Calculate ASCII sum for string t
        for (char c : t.toCharArray()) {
            asciiSumT += (int) c;
        }

        // Find the difference in ASCII sums
        int difference = asciiSumT - asciiSumS;

        // Convert the difference to a character
        return (char) difference;
            }
        }
    
