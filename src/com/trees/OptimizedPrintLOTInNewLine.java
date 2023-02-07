//Given a binary tree, print level order traversal i.e. print level by level
//Idea is to use queue i.e. enqueue and dequeue
//TC -> O(N) becauase every element in the tree is scanned only once
//SC -> O(1)
package com.trees;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OptimizedPrintLOTInNewLine {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        node.right.right.left = new TreeNode(6);
        node.right.right.right = new TreeNode(7);
        List<List<Integer>> plist = printLOTInNewLine(node);
        System.out.println("Level Order Traversal in New Lines");
        for(List<Integer> list:plist){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> printLOTInNewLine(TreeNode node) {
        List<List<TreeNode>> parentList = new ArrayList<List<TreeNode>>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<TreeNode> list = new ArrayList<>();
        list.add(node);
        parentList.add(list);
        int f = 0;
        int parentSize = -1;
        while (f != parentSize) {
            int size = parentList.get(f).size();
            List<TreeNode> list1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode left = parentList.get(f).get(i).left;
                TreeNode right = parentList.get(f).get(i).right;
                if (left != null)
                    list1.add(left);
                if (right != null)
                    list1.add(right);
            }
            f++;
            if (!list1.isEmpty())
                parentList.add(list1);
            parentSize = parentList.size();
        }
        //Prepare List<List<Integer>> now
        for(List<TreeNode> nodes: parentList){
            List<Integer> intlist = new ArrayList<>();
            for(TreeNode node1:nodes){
                intlist.add(node1.data);
            }
            ans.add(intlist);
        }
        return ans;
    }
}
