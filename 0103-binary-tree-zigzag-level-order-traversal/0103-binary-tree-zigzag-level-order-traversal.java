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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int levelNum = 0;
        while(!q.isEmpty()){
            int currlevel=q.size();
            LinkedList<Integer> current=new LinkedList<>();
            for(int i=0;i<currlevel;i++){
                TreeNode curr=q.poll();
                if(levelNum%2==0){
                    current.addLast(curr.val);
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
                else{
                    current.addFirst(curr.val);
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }

            }
            result.add(current);
            levelNum++;
        }
        return result;
    }
}