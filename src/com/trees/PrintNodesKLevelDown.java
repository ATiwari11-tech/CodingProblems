//Given a binary tree, print nodes which are k level down from root node
package com.trees;

public class PrintNodesKLevelDown {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
    }
}
