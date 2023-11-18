

class Solution{
    static long factorial(int n){
        // code here
        long fact=1;
        while(n!=0){
            fact=fact*n;
            n=n-1;
        }
        
        return fact;
    }
}
