class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = -1;
        for (int i = 0; i < nums.length; i++)
            r = Math.max(r, nums[i]);

        int ans = -1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;

            if (valid(mid, nums) <= threshold) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    int valid(int n, int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] / n;

            if (nums[i] % n != 0)
                sum++;

            total += sum;
        }
        return total;
    }
}