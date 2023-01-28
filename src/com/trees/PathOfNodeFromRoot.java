//Given a binary tree with unique values, you need to find the path from root node to that node
//Return an array with path values
package com.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PathOfNodeFromRoot {
    static List<Integer> list = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        getPath(node,5);
        System.out.println("Path is:"+list);
    }
    public static boolean getPath(TreeNode node, int k){
        if(node == null)
            return false;
        list.add(node.data);
        if(node.data == k)
            return true;
        if(getPath(node.left,k) || getPath(node.right,k))
            return true;
        list.remove(list.size()-1);
        return false;
    }
}
