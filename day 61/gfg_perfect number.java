

// User function Template for Java

class Solution {
    int isPerfect(int n) {
        // code here
        int fact=1;
        int sum=0;
        int or = n;
        
        int rem=0;
        while(or!=0){
             rem=or%10;
            sum+=factorial(rem);
            or=or/10;
        }
        
        return (sum==n)? 1:0;
    }
    
   
    // Function to calculate the factorial of a number
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
