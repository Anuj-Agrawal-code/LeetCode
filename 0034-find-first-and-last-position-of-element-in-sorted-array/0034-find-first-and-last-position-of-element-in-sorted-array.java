class Solution {
    public int[] searchRange(int[] nums, int target) {
        int pos[] = new int[2];
        int firstocc = -1;
        int lastocc = -1;

        int left = 0;
        int right = nums.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] > target)
                right = mid - 1;
            else
            {
                firstocc = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] > target)
                right = mid - 1;
            else
            {
                lastocc = mid;
                left = mid + 1;
            }
        }
        
        pos[0] = firstocc;
        pos[1] = lastocc;
        return pos;
    }
}