class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums)
            maxHeap.offer(num);

        int ans = 0;

        for(int i = 0; i < k; i++)
            ans = maxHeap.poll();

        return ans;

    }
}