class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];

            ans[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return ans;
    }
}