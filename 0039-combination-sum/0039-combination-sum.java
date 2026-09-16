class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, candidates, new ArrayList<>(), target);
        return ans;
    }

    void backtrack(int index, int [] can, List<Integer> curr, int target)
    {
        if(target < 0 || index == can.length)        // invalid cases
            return;

        if(target == 0)                              //target found
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(can[index]);
        backtrack(index, can, curr, target - can[index]);

        curr.remove(curr.size() - 1);

        backtrack(index + 1, can, curr, target); 
    }
}