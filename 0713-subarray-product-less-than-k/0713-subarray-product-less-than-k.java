class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, pdt = 1, count = 0, n = nums.length;

        while (right < n) {
            pdt *= nums[right];

            while (pdt >= k && left <= right) {
                pdt /= nums[left++];
            }
            count += (right - left + 1);
            right++;
        }

        return count;
    }
}