class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
       int maxs = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            if (maxs < sum)
                maxs = sum;
            if (sum < 0)
                sum = 0;
            }
            return maxs;
    }
}
