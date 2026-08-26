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
        if (root == null) {
                    return 0;
        }

        return DfsCount(root.val, root);
    }

    public int DfsCount (int x, TreeNode root) {
        if (root == null) {
            return 0;
        }

        int res = (root.val >= x) ? 1 : 0;
        int b = Math.max(x, root.val);
        res += DfsCount(b, root.left); 
        res += DfsCount(b, root.right);

        return res;
    }
}
