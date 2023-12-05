class Solution{
    static long nearestPowerOf2(long n){
        //code here
        if(n<0)
        return 1;
        
        long result=1;
        
        while(result < n){
            result=result*2;
        }
        
        return result;
        
        
    }
}
