class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;

        for(int w : weights)
        {
            l = Math.max(l, w);        //min capacity -> can carry the biggest item
            r += w;                    //max capacity -> can carry all in one day
        }
        
        int ans = r;
        while(l <= r)
        {
            int mid = l + (r - l)/2;

            if(canShip(weights,days,mid))
            {
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }

    boolean canShip(int []weights, int days, int capacity)
    {
        int d = 1;                       //atleast one day
        int sum = 0;

        for(int w : weights)
        {
            if(sum + w > capacity)       //if adding this current weight exceeds capacity
            {                            // start new day
                d++;
                sum = 0;
            }
            sum += w;
        }
        return d <= days;
    }
}