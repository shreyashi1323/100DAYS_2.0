class Solution
{
    
  public void printNos(int N)
    {
      
       if(N>1)
       printNos(N-1);
       System.out.print(N+" ");
    }
}
