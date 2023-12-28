class Solution {
    static String armstrongNumber(int n){
        // code here
        int a,b=0,c=n;
        while(n>0){
            a= n%10;
            n=n/10;
            b=b+(a*a*a);
        }
        
        if(c==b){
            return "Yes";
        }
        else
        return "No";
    }
}
