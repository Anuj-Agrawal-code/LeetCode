class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0,j = 0;
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
    
        while(j < nums.length)
        {
            sum += nums[j];
            while(sum >= target)
            {
                min_len = Math.min(min_len, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        if(min_len == Integer.MAX_VALUE)
            return 0;
        else
            return min_len;
    }
}