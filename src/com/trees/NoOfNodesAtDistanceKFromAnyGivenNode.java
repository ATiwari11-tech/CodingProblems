//Given a binary tree, calculate no. of nodes at distance K from a given node, both directions i.e. up and bottom will
//be considered
//TC -> O(min(N,2^k)
//SC -> O(min(h,k))

package com.trees;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class NoOfNodesAtDistanceKFromAnyGivenNode {
    static List<TreeNode> path = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
//        node.left = new TreeNode(5);
//        node.right = new TreeNode(11);
//        node.left.left = new TreeNode(1);
//        node.left.right = new TreeNode(7);
//        node.right.right = new TreeNode(15);
        node.left = new TreeNode(1);
        node.right = new TreeNode(11);
        node.right.left = new TreeNode(12);
        node.right.right = new TreeNode(23);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.left.left.left = new TreeNode(4);
        node.left.left.right = new TreeNode(5);
        node.left.left.left.left = new TreeNode(8);
        node.left.left.left.right = new TreeNode(9);
        node.left.left.right.left = new TreeNode(10);
        node.left.left.right.right = new TreeNode(99);
        node.left.left.right.left.left = new TreeNode(16);
        node.left.left.right.left.right = new TreeNode(17);
        node.left.right.left = new TreeNode(6);
        node.left.right.right = new TreeNode(7);
        node.left.right.left.left = new TreeNode(12);
        node.left.right.left.right = new TreeNode(13);
        node.left.right.right.left = new TreeNode(14);
        node.left.right.right.right = new TreeNode(15);
        node.left.left.right.right.left = new TreeNode(18);
        node.left.left.right.right.right = new TreeNode(19);
        //int k = 1;
        //int data = 5;Given Node Value
        int k = 2;
        int data = 5;


        //find path from the given node to root
        System.out.println("Path of Node to Root Is:");
        getPath(node,data);
       //Print the path nodes values
        for(TreeNode node1:path){
            System.out.println(node1.data);
        }
        System.out.println("Final Result");
        for(int i=0;i<path.size();i++){
            printNodesAtDisK(path.get(i),0,k-i,i==0 ? null : path.get(i-1));
        }
    }
    public static boolean getPath(TreeNode node, int data){
        if(node == null)
            return false;
        if(node.data == data)
        {
            path.add(node);
            return true;
        }
        if(getPath(node.left,data)){
            path.add(node);
            return true;
        }
        if(getPath(node.right,data)){
            path.add(node);
            return true;
        }
        return false;
    }
    public static int printNodesAtDisK(TreeNode node,int level,int k,TreeNode blocker){
        if(node == null || k < 0 || node == blocker)
            return 0;
        if(level == k) {
            System.out.print(node.data+",");
            return 1;
        }
        return printNodesAtDisK(node.left,level+1,k,blocker) + printNodesAtDisK(node.right,level+1,k,blocker);
    }
}
