class Solution
{
    public long find_fact(int n)
    {
        // Code here
       long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
