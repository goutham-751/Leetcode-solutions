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
    List<String> result;
    public List<String> binaryTreePaths(TreeNode root) {
        result=new ArrayList<>();
        if(root!=null){
            pathfinder(root,"");
        }
        return result;
    }
    public void pathfinder(TreeNode root, String path){
        path=path+root.val;//concatenation
        if(root.left==null && root.right==null) {
            result.add(path);
            return;//base case
        }
        if(root.left!=null){
            pathfinder(root.left,path+ "->");
        }
        if(root.right!=null){
            pathfinder(root.right,path+ "->");
        }
    }
}