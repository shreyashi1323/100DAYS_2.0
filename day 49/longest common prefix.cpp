class Solution {
public:
    string longestCommonPrefix(vector<string>& str) {
        /*if (str.empty()) {
            return ""; // Return an empty string for an empty input vector
        }*/

        sort(str.begin(), str.end());
        string s1 = str[0];
        string s2 = str[str.size() - 1];

        string ans = "";
        int i = 0, j = 0;

        while (i < s1.size() && j < s2.size()) {
            if (s1[i] == s2[j]) {
                ans += s1[i];
                i++; // Increment i and j
                j++;
            } else {
                break;
            }
        }

        return ans;
    }
};
