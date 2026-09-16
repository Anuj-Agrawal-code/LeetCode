class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max_count = 0;
        
        for(int n : nums)
        {
            set.add(n);
        }
        
        for(int num : set)     
        {
            
            if(!set.contains(num - 1))
            {  
                int current = num;
                int count = 1;

                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                max_count = Math.max(count,max_count);
            }
        }
        return max_count;
    }
}