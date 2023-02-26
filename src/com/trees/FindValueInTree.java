package com.trees;

public class FindValueInTree {
    static boolean isPresent = false;
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        System.out.println("Searched node is present:"+searchNode(node,5));
    }
    public static boolean searchNode(TreeNode node,int data){
        if(node == null)
            return isPresent;
        if(node.data == data){
            isPresent = true;
            return isPresent;
        }
        else{
            searchNode(node.left,data);
            searchNode(node.right,data);
        }
        return isPresent;
    }
}
