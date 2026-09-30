/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    static int max = 0;

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        max = 0;
        backtrack(root, 1);
        
        return max;
    }
    

    public static void backtrack(TreeNode root, int length)
    {
        if(root == null)
            return;
        
        max = Math.max(length,max);

        backtrack(root.left, length + 1);
        backtrack(root.right, length + 1);
    }
}