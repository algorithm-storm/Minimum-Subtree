/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {

    public int maxValue = Integer.MAX_VALUE;
    public TreeNode subTree;

    public static void main(String [] args){

        TreeNode root = new TreeNode(1);
        TreeNode leftTree = new TreeNode(2);
        root.left = leftTree;
        TreeNode rightTree4 = new TreeNode(4);
        TreeNode rightTree5 = new TreeNode(5);
        TreeNode rightTree = new TreeNode(3);
        rightTree.left = rightTree4;
        rightTree.right = rightTree5;
        root.right = rightTree;

        Solution a = new Solution();
        System.out.println(a.findSubtree(root));

    }

    /*
     * @param root: the root of binary tree
     * @return: the root of the maximum average of subtree
     */
    public TreeNode findSubtree(TreeNode root) {

        helper(root);
        return subTree;
    }

    private int helper(TreeNode root){

        if(root == null){
            return 0;
        }
        int sum = helper(root.left) + helper(root.right)+ root.val;
        if(sum < maxValue){
            maxValue = sum;
            subTree = root;
        }
        return sum;
    }

}
