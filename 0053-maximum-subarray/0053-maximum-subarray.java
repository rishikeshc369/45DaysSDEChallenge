class Solution {
    public int maxSubArray(int[] nums) {
        int mxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            mxi = Math.max(mxi, sum);
            sum = Math.max(sum, 0);
        }
        return mxi;
    }

}