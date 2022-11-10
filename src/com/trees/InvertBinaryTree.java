//Invert the binary tree i.e. the left should go right and right should show left
package com.trees;

public class InvertBinaryTree {
    public static void main(String args[]){
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(20);
        node.right = new TreeNode(12);
        node.left.right = new TreeNode(30);
        node.right.left = new TreeNode(8);
        node.right.right = new TreeNode(4);
        node.right.left.right = new TreeNode(6);
        printBeforeTreeElements(node);
        invertTree(node);
        printAfterTreeElements(node);
    }
    public static void invertTree(TreeNode node){
        if(node == null)
            return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);
    }
    public static void printBeforeTreeElements(TreeNode node){
        System.out.print(node.data+"->"+node.left.data+"->"+node.right.data+"->"+node.left.right.data+"->"
                +node.right.left.data+"->"+node.right.right.data+"->"+node.right.left.right.data);
    }
    public static void printAfterTreeElements(TreeNode node){
        System.out.println();
        System.out.print(node.data+"->"+node.left.data+"->"+node.right.data+"->"+node.left.left.data+"->"
                +node.left.right.data+"->"+node.left.right.left.data+"->"+node.right.left.data);
    }
}
