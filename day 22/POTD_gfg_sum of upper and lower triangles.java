

class Solution
{   
    public:
    //Function to return sum of upper and lower triangles of a matrix.
    vector<int> sumTriangles(const vector<vector<int> >& matrix, int n)
    {
        int us = 0 , ls=0;
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                if(i<j)
                    us += matrix[i][j] ;
                else if(i>j)
                    ls += matrix[i][j] ;
                else{
                    us += matrix[i][j] ;
                    ls += matrix[i][j] ;
                }
            }
        }
        return {us ,ls};
    }
};
