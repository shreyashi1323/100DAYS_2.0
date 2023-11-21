class Solution{
    static void printTillN(int n){
        // code here
        if(n==0)
        return ;
        
        else
         printTillN(n-1);
        System.out.print(n+" ");
      
      
        
    }
}
