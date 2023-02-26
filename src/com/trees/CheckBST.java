//Given a Binary Tree check if it is a Binary Search Tree
//Idea is to create range limit at every node, from where to where the range is valid
//for example for root node valid range should be -infinity < root val < +infinity
//for root left node valid range should be -infinity < root left val < root.val-1
//for root right node valid range should be  root val+1 < root right val < +infinity
//TC -> O(N)
//Sc -> O(H), height because of recursion

package com.trees;

public class CheckBST {
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(11);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(15);
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        boolean isBST = checkBST(node,minVal,maxVal);
        System.out.println("This is a BST "+isBST);
    }
    public static boolean checkBST(TreeNode node,int min, int max){
        if(node == null)
            return true;
        if(node.data < min || node.data > max)
            return false;
        return checkBST(node.left,min, node.data-1) && checkBST(node.right,node.data+1,max);
    }
}
