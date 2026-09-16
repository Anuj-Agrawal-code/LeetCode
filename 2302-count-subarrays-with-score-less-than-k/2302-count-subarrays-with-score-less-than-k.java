class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum = 0;
        int left = 0; 
        int right = 0;
        int n = nums.length;
        int len = 0;
        long count = 0;

        while(right < n)
        {
            sum += nums[right];
            len = right - left + 1;

            while(sum*len >= k)
            {
                sum -= nums[left++];
                len--;
            }

            count += right - left + 1;
            right++;
        }
        return count;
    }
}