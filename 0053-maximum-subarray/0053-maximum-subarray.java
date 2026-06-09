class Solution {
    public int maxSubArray(int[] nums) {
        int mxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            mxi = sum > mxi ? sum : mxi;
            sum = sum < 0 ? 0 : sum;
        }
        return mxi;
    }

}