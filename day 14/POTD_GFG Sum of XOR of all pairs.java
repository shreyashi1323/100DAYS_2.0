class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        long result = 0;
        
        for (int bit = 0; bit < 32; bit++) {
            int countBitSet = 0;
            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    countBitSet++;
                }
            }
            int countBitNotSet = n - countBitSet;
            
            // Count the number of pairs for this bit
            result += (1L << bit) * countBitSet * countBitNotSet;
        }
        
        return result;
    }
    
    
}
