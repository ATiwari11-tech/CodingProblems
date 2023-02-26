//Given a binary tree, construct inorder traversal iteratively
//TC -> O(N)
//SC -> O(H), height of tree
package com.trees;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class InOrderWithoutRecursion {
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(11);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(15);
        System.out.println("In Order Traversal of Tree Iteratively are");
        printInOrder(node);
    }
    public static void printInOrder(TreeNode node){
        TreeNode curr = node;
        Stack<TreeNode> st = new Stack<>();
        while(curr !=null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.pop();
                System.out.println(curr.data);
                curr = curr.right;
            }
        }
    }
}
