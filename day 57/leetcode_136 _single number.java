class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
      int  n=nums.length;
       int ans=nums[n-1];
       for(int i=0;i<n-1;i+=2){
           if(nums[i]!=nums[i+1]){
               ans=nums[i];
               break;
           }
       } 
       return ans;
    }
}
