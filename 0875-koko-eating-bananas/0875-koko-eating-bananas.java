class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int p : piles)
            r = Math.max(p , r);

        int ans = r;
        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(canFinish(piles, h, mid))
            {
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }

    boolean canFinish(int piles[], int total_hr, int no_of_banana)
    {
        long hours = 0;

        for(int p : piles)
        {
            int hr = p / no_of_banana;

            if(p % no_of_banana != 0)
                hr++;
            
            hours += hr;
        }
        return hours <= total_hr;
    }
}