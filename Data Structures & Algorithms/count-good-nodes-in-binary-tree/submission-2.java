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
        return dfs(root,root.val);
    }

    public int dfs(TreeNode root, int value) {
        if(root == null)
            return 0;
        int counter = 0;
        int maxVal = value;
        if (maxVal <= root.val) {
            maxVal = root.val;
            counter++;
        }
        int left = dfs(root.left,maxVal);
        int right = dfs(root.right, maxVal);
        return counter+left+right;
    }
}
