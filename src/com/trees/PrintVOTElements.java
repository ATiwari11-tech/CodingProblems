//Given a binary tree, print vertical order traversal
//Idea is to traverse level order then create Map with distance of node from root and it's reference
//TC->O(N)->Accessing all elements only once
//SC->O(N)->Maintaining queue which has at any moment max width elements of tree i.e. max number of elements in any level
package com.trees;

import com.sun.source.tree.Tree;

import java.util.*;

class Info{
    TreeNode node;
    int dis;
    Info(TreeNode node,int dis){
        this.node = node;
        this.dis=dis;
    }
}

public class PrintVOTElements {
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
//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(5);
//        node.right = new TreeNode(7);
//        node.left.left = new TreeNode(9);
//        node.right.left = new TreeNode(6);
//        node.right.right = new TreeNode(8);
//        node.right.left.left = new TreeNode(1);
        printVOT(node);
    }
    public static void printVOT(TreeNode node){
        Queue<Info> q = new LinkedList<>();
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        HashMap<Integer, List<TreeNode>> hm = new HashMap<Integer, List<TreeNode>>();
        q.add(new Info(node,0));

        while(!q.isEmpty()){
            List<TreeNode> list = new ArrayList<>();
            List<TreeNode> subList = new ArrayList<>();
            Info i1 = q.peek();
            if(hm.get(i1.dis) == null) {
                list.add(i1.node);
                hm.put(i1.dis,list);
            }
            else {
                subList = hm.get(i1.dis);
                subList.add(i1.node);
                hm.put(i1.dis,subList);
            }
            minIndex = Math.min(minIndex,i1.dis);
            maxIndex = Math.max(maxIndex,i1.dis);
            if(i1.node.left != null)
                q.add(new Info(i1.node.left,i1.dis-1));
            if(i1.node.right != null)
                q.add(new Info(i1.node.right,i1.dis+1));
            q.remove();
        }
        System.out.println("Min Index:"+minIndex);
        System.out.println("Max Index:"+maxIndex);
        System.out.println("Has MAp is:");
        for(int i = minIndex;i<=maxIndex;i++){
            System.out.println(hm);
        }
        System.out.println("Vertical Order Traversal elements are:");
        for(int i = minIndex;i<=maxIndex;i++){
            List<TreeNode> nodes = hm.get(i);
            for(TreeNode node1:nodes){
                System.out.println(i+"->"+node1.data);
            }
        }
    }
}
