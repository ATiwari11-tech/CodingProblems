//Given a binary tree, find the size of the tree i.e. no. of nodes in a tree
//TC -> O(N), as we are just scanning every node once
//SC -> O(H), height of tree i.e. maximum distance of leaf node from root node
package com.trees;

public class SizeOfTree {
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
        System.out.println("Size of Tree is:"+getSize(node));
    }
    public static int getSize(TreeNode node){
        if(node == null)
            return 0;
        int sl = getSize(node.left);
        int sr = getSize(node.right);
        return 1+sl+sr;
    }
}
