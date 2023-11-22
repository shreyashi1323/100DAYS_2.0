

//User function Template for Java
class Solution{
    static int sumOfDigits(int n) {
        // code here
        int temp=n;
        int sum=0;
        
        while(temp!=0){
            int rem= temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        return sum;
    }
}
       
