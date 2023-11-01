class GfG {
    int convertfive(int n) {
        int newn=0;
       while(n!=0){
         int rem=n%10;
         
         if(rem==0){
             rem=rem+5;
         }
         newn=(newn*10)+rem;
         n=n/10;
       }
       
       while(newn!=0){
         int rem=newn%10;
         
         n=(n*10)+rem;
         newn=newn/10;
       }
       
       return n;
    }
}
