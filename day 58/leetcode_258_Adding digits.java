class Solution {
    public int addDigits(int num) {
        int or=num;
        int sum=0;
      while( or!=0) {
        int rem=or%10;
        sum=sum+rem;
        or=or/10;
      }
     while(sum>=10){
         int temp=sum;
         sum=0;
         while(temp!=0){
             int rem=temp%10;
             sum=sum+rem;
             temp=temp/10;
         }
     }
     return sum;
    }
}
