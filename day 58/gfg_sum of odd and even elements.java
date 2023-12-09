class Solution
{
    public int[] find_sum(int n)
    {
        // Code here
        int arr[]=new int[2];
        int sume=0;
        int sumo=0;
        for(int i=1;i<=n;i+=2){
            sumo=sumo+i;
            
        }
        for(int i=2;i<=n;i+=2){
            sume=sume+i;
          
        }
        
       for(int i=1;i<=2;i++){
           arr[0]=sumo;
           arr[1]=sume;
       }
       
       return arr;
        
    }
}
