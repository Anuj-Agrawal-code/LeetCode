class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return ans;
    }

    public void backtrack(int index, int[] nums, List<Integer> curr)
    {
        //Base Case
        if(nums.length == index)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        //Take the number 
        curr.add(nums[index]);
        backtrack(index + 1, nums, curr);

        //undo the decision 0r delete the last element 
        curr.remove(curr.size() - 1);

        //Don't take the number
        backtrack(index + 1, nums, curr);
    }
}