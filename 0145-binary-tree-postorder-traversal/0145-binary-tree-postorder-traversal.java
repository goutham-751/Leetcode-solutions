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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        return postorder(list,root);
    }
    public List<Integer> postorder(ArrayList<Integer>list,TreeNode root){
        if(root==null) return list;
        postorder(list,root.left);
        postorder(list,root.right);
        list.add(root.val);
        return list;
    }
}