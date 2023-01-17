package com.trees;

public class HeightOfBinaryTree {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        node.right.right.left = new TreeNode(8);
        node.left.left.right = new TreeNode(9);
        int height = getHeight(node);
        System.out.println("Height of Tree is:"+(height-1));
    }
    public static int getHeight(TreeNode node){
        if(node == null)
            return 0;
        int lh = getHeight(node.left);
        int rh = getHeight(node.right);
        return 1 + Math.max(lh,rh);
    }
}
