//Given two tress check whether they are symmetric or not i.e. mirror of itself or not
package com.trees;

public class SymmetricTrees {
    public static void main(String args[]){
        TreeNode1 node1;
        TreeNode2 node2;
        isSymmetric(node1,node2);
    }
    public static boolean isSymmetric(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
            return true;
        if(node1 == null || node2 == null)
            return false;
        if(node1.data != node2.data)
            return false;
        return isSymmetric(node1.left,node2.right) && isSymmetric(node1.right,node2.left);
    }
}
