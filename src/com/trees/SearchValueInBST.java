//Given a binary search tree, Search a value in Binary Search Tree
//TC -> O(H), if it's balanced binary tree it would be O(logN)
package com.trees;

public class SearchValueInBST {
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(11);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(15);
        System.out.println("Given value is present in BST "+searchValue(node,7));
    }
    public static boolean searchValue(TreeNode node,int k){
        TreeNode t = node;
        while(t != null){
            if(t.data == k)
                return true;
            if(t.data > k)
                t = t.left;
            else if(t.data < k)
                t = t.right;
        }
        return false;
    }
}
