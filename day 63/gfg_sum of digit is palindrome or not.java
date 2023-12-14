class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        int or=n;
       
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        
            
        }
        int or1=sum;
        int rev=0;
        while(sum!=0){
            int rem=sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        
        if(rev==or1){
            return 1;
        }
        else{
            return 0;
        }
        
       
    }
}
