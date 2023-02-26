//Given a binary tree, print the top view of all the elements
//Idea is to print the first element of Vertical Order traversal
//TC -> O(N)
//SC -> O(N), because of Queue used
package com.trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class PrintTopViewOfTree {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(8);
        node.left.right.left.left = new TreeNode(9);
        node.left.right.left.right = new TreeNode(11);
        node.right.left = new TreeNode(9);
        node.right.right = new TreeNode(7);
        node.right.right.left = new TreeNode(12);
        node.right.right.right = new TreeNode(13);
        printVOT(node);
    }
    public static void printVOT(TreeNode node){
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(node,0));
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        HashMap<Integer, List<TreeNode>> hm = new HashMap<Integer, List<TreeNode>>();
        while(!q.isEmpty()){
            List<TreeNode> list = new ArrayList<>();
            Info i = q.peek();
            if(hm.get(i.dis) == null){
                list.add(i.node);
                hm.put(i.dis,list);
            }
            else{
                list = hm.get(i.dis);
                list.add(i.node);
                hm.put(i.dis,list);
            }
            if(i.node.left != null)
                q.add(new Info(i.node.left,i.dis-1));
            if(i.node.right != null)
                q.add((new Info(i.node.right,i.dis+1)));
            minVal = Math.min(minVal,i.dis);
            maxVal = Math.max(maxVal,i.dis);
            q.remove();
        }
        System.out.println("VOT Traversal Values Are:");
        for(int i=minVal;i<=maxVal;i++){
            List<TreeNode> l = hm.get(i);
            for(TreeNode node1:l){
                System.out.println(i+"->"+node1.data);
            }
        }
        //Print the first entry of VOT Traversed values
        System.out.println("Top View Elements Are:");
        for(int i=minVal;i<=maxVal;i++){
            List<TreeNode> l = hm.get(i);
            System.out.println(i+"->"+l.get(0).data);
//            for(TreeNode node1:l){
//                System.out.println(i+"->"+node1.data);
//                break;
//            }
        }
    }

}
