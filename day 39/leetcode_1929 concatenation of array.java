class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
       int n1= 2*n;
       int [] ans = new int [n1];
       for(int i =0;i<n;i++) {
          ans[i]=nums[i];
       }
       int count= n;
       for(int i =0;i<n;i++) {
          ans[count]=nums[i];
          count++;
       }
       return ans;
    }
}
