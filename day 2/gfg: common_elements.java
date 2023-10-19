class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       ArrayList<Integer> ans= new ArrayList<>();
       
       int i=0;
       int j=0;
       int k=0;
       
       while(i<n1 && j<n2 && k<n3){
           if(A[i]==B[j] && B[j]==C[k]){
               if(!ans.contains(A[i])){
                   ans.add(A[i]);
               }
               i++;
               j++;
               k++;
           }
           else if(A[i]<B[j]){
               i++;
           }
           else if(B[j]<C[k]){
               j++;
           }
           else {
               k++;
           }
       }
       return ans;
    }
}
