class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int i =0;
        int j =0;
        int count =0;
        sort(s.begin(),s.end());
        sort(g.begin(),g.end());
        while(i<s.size() and j <g.size()){
            if(s[i]>=g[j]){
                i++;
                j++;
                count++;
            }
            else{
                i++;
            }
        }
        return count;
    }
};