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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int currentnumber){
        if(root==null){
            return 0;
        }
        currentnumber=currentnumber*10+root.val;
        if(root.right==null && root.left==null) return currentnumber;
        int leftsum=dfs(root.left,currentnumber);
        int rightsum=dfs(root.right,currentnumber);
        return leftsum+rightsum;
    }
}