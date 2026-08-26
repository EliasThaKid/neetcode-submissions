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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        List<List<TreeNode>> queue = new ArrayList<>();
        List<TreeNode> start = new ArrayList<>();
        start.add(root);
        queue.add(start);

        while (!queue.isEmpty()) {
            List<TreeNode> curr = queue.remove(0);
            List<TreeNode> nodes = new ArrayList<>();
            List<Integer> nodeVal = new ArrayList<>();
            for (TreeNode node : curr) {
                nodeVal.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            if (!nodes.isEmpty()) {queue.add(nodes);}
            res.add(nodeVal);
        }

        return res;
    }
}
