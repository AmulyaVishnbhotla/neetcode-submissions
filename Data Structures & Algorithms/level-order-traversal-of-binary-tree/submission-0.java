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
        if(root == null)
        return new ArrayList<>();
        ArrayList<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int height = q.size();
            ArrayList<Integer> tmpLst = new ArrayList<>();
            for(int i=0;i<height;i++){
                TreeNode tmp = q.poll();
                tmpLst.add(tmp.val);
                if(tmp.left!=null)
                q.add(tmp.left);
                if(tmp.right!=null)
                q.add(tmp.right);
            }
            lst.add(tmpLst);
        }

        return lst;
    }
}
