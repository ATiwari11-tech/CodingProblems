//Given a binary tree, print level order traversal i.e. print level by level
//Idea is to use queue i.e. enqueue and dequeue
package com.trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLevelOrderTraversal {
    static List<Integer> list = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(9);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.left.left = new TreeNode(1);
        System.out.println("LOT Traversal of this tree is:"+printLOT(node));
    }
    public static List<Integer> printLOT(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode f = q.remove();
            list.add(f.data);
            TreeNode left = f.left;
            TreeNode right = f.right;
            if(left != null) {
                q.add(left);
            }
            if(right != null) {
                q.add(right);
            }
        }
        return list;
    }
}
