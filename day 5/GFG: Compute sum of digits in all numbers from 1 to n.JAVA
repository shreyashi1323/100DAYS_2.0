class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            int n2=i;
        while (n2 > 0) {
            sum += n2 % 10;  
            n2 = n2/10;        
        }
    }
    return sum;
}}
