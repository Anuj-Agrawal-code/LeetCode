class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums, target);
        int last = last(nums, target) - 1;

        if(first == nums.length || nums[first] != target)
            return new int[]{-1,-1};
        else
            return new int[]{first,last}; 
    }

    public int first(int [] arr, int target)
    {
        int l = 0, r = arr.length - 1;
        int ans = arr.length;

        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(arr[mid] >= target)
            {
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1; 
        }
        return ans;
    }

    public int last(int [] arr, int target)
    {
        int l = 0, r = arr.length - 1;
        int ans = arr.length;

        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(arr[mid] > target)
            {
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1; 
        }
        return ans;
    }
}