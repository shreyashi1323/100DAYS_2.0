
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int n)
    {
        int count=0;
       Arrays.sort(A);
       Arrays.sort(B);
       for(int i=0;i<n;i++){
           if(A[i]==B[i])
           count++;
       }
       if (count>=n)
       return true;
       
       else
       return false;
    }
}
