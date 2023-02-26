//Given a binary tree with unique values, you need to find the path from that node to root node
//Return an array with path values
package com.trees;

import java.util.ArrayList;
import java.util.List;

public class PathOfRootFromNode {
    static List<Integer> list = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        System.out.println("Path from Node to Root Is:");
        getPath(node,5);
        System.out.println(list);
    }
    public static boolean getPath(TreeNode node, int k){
        if(node == null)
            return false;
       if(node.data == k) {
           list.add(node.data);
           return true;
       }
       if(getPath(node.left,k)) {
           list.add(node.data);
           return true;
       }
       if(getPath(node.right,k)) {
            list.add(node.data);
            return true;
        }
       return false;
    }
}
