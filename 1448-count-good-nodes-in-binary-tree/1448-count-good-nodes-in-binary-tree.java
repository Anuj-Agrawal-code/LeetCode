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
    public int goodNodes(TreeNode root) {

        count = 0;

        goodNode(root, root.val);
        
        return count;
    }   

    static int count = 0;

    public static void goodNode(TreeNode root, int max)
    {

        if(root == null)
            return;
        
        if(root.val >= max)
            count++;

        max = Math.max(max, root.val);

        goodNode(root.left, max);
        goodNode(root.right, max);
    }
}