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
    public int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSubTreeVal = dfs(root.left);
        int rightSubTreeVal = dfs(root.right);
        res = Math.max(leftSubTreeVal+rightSubTreeVal, res);

        return  1+Math.max(leftSubTreeVal, rightSubTreeVal);

    }
}
