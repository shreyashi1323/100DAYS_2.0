class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
               count++;
            }
           
        }
        if(count>0)
        return true;

        else
        return false;
    }
}
