class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
      ArrayList<Integer> ans = new ArrayList<>();
      function(arr , ans , 0 , 0 , N);
      return ans;
    }
    
    public void function(ArrayList<Integer> arr, ArrayList<Integer> ans, int idx, int sum, int N){
        // base condition
        if(idx==N){
            ans.add(sum);
            return ;
        }
        function(arr, ans , idx+1, sum+arr.get(idx), N);//when we include the element 
        function(arr, ans, idx+1, sum, N);//when we do not include the element
    }
}
