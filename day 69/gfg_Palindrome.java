class Solution
{
    public String is_palindrome(int n)
    {
        int or=n;
        int rev=0;
        while(or!=0){
            int rem=or%10;
            rev=rev*10+rem;
            or=or/10;
        }
        
        if(rev==n){
            return "Yes";
        }
        else
        return "No";
    }
}
