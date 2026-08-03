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
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        helper(root,targetsum,result,current);
        return result;
    }
    public void helper(TreeNode root,int targetsum,List<List<Integer>> result,List<Integer> current){
        if(root==null) return;
        current.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==targetsum){
                result.add(new ArrayList<>(current));
            }
        }
        helper(root.left,targetsum-root.val,result,current);
        helper(root.right,targetsum-root.val,result,current);
        //backtracking comes into the picture 
        current.remove(current.size()-1);
    }
}