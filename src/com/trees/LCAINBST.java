//Given a Binary Search Tree, find lowest common ancestor of two nodes i.e. x and y
//TC -> O(H)
//SC -> O(1)
package com.trees;

public class LCAINBST {
    public static void main(String args[]){
//        TreeNode node = new TreeNode(10);
//        node.left = new TreeNode(8);
//        node.right = new TreeNode(12);
//        node.right.left = new TreeNode(11);
//        node.right.right = new TreeNode(15);
//        int x=11;
//        int y=15;
        TreeNode node = new TreeNode(13);
        node.left = new TreeNode(9);
        node.right = new TreeNode(25);
        node.right.left = new TreeNode(24);
        node.right.right = new TreeNode(28);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode(11);
        int x=8;
        int y=11;
        System.out.println("LCA of this BST Is:");
        System.out.println(getLCA(node,x,y));
    }
    public static int getLCA(TreeNode node, int x,int y){
        TreeNode t = node;
        while(t != null) {
            if (t.data > x && t.data > y)
                t = t.left;
            else if (t.data < x && t.data < y)
                t = t.right;
            else
                return t.data;
        }
        return 0;
    }
}
