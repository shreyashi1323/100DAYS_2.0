class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int n = v.length;
        int  left =-1;
        int right =-1;
       
        for(int i =0;i<=n-1;i++){
            if(v[i]==x){
                if(left==-1){
                    left =i;
                }
                right =i;
            }}
            
            
           if(left ==-1){
               return  new pair(-1,-1);
           }
           else{
               return  new pair(left, right);
           }
    }
}
