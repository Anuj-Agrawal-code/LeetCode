class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = Integer.MIN_VALUE;
        int i = 0, j = 0; 
        double sum = 0;
        while(j < nums.length)
        {
            sum += nums[j];
            while((j - i + 1) == k)
            {
                max_avg = Math.max(max_avg,sum/(j - i + 1));
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return max_avg;
    }
}