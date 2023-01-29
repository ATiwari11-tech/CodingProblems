//Given a binary tree, print level order traversal i.e. print level by level
//Idea is to use queue i.e. enqueue and dequeue
package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OptimizedPrintLevelOrderTraversal {
    public static void main(String args[]){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(9);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.left.left = new TreeNode(1);
        System.out.println("LOT Traversal Nodes:"+printLOT(node));
    }
    public static List<Integer> printLOT(TreeNode node){
        List<TreeNode> list = new ArrayList<>();
        List<Integer> dataList = new ArrayList<>();
        int f = 0;
        int size = -1;
        list.add(node);
        while(f != size) {
           TreeNode left = list.get(f).left;
           TreeNode right = list.get(f).right;
           if (left != null)
               list.add(left);
           if (right != null)
               list.add(right);
           f++;
           size = list.size();
       }
        for(TreeNode node1:list){
            dataList.add(node1.data);
        }
        return dataList;
    }
}
