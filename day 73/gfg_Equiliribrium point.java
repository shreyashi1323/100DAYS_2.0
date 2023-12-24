class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int lefts=0;
        int rights=0;
        for(int i=0;i<n;i++){
            lefts+=arr[i];
        }
        for(int i=0;i<n;i++){
            lefts-=arr[i];
            if(lefts==rights){
                return i+1;
            }
            
            rights+=arr[i];
        }
        
        
        return -1;
    }
}
