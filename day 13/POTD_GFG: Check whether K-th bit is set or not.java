
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
       int mask = 1 << k;
        
         // Perform a bitwise AND operation between N and the mask
        // If the result is non-zero, it means the Kth bit is set
        return (n & mask) != 0;
    }
    
}
