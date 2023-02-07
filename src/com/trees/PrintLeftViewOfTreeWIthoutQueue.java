//Given a binary tree, print left view of tree i.e. print only the first node of every level
//if there are both left and right node form level 1 then only left node will be printed as right will be
//shadowed from the left node but if only right node is present then that node should get printed
//level0 any ways will have only 1 node i.e. root so that will always come

//Example for the given input below
//Output should be -> 1,2,4,6

//TC -> O(N)
//SC -> O(1) i.e. no extra space
//List<List<Integer>> result is expected in the result therefore doesn't take into account as extra space

package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLeftViewOfTreeWIthoutQueue {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        node.right.right.left = new TreeNode(6);
        node.right.right.right = new TreeNode(7);
        List<Integer> plist = printLOTInNewLine(node);
        System.out.println("Left View of Tree Is:"+plist);
    }
    public static List<Integer> printLOTInNewLine(TreeNode node) {
        List<List<TreeNode>> parentList = new ArrayList<List<TreeNode>>();
        List<Integer> ans = new ArrayList<>();
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
            for(TreeNode node1:nodes){
                ans.add(node1.data);
                break;
            }
        }
        return ans;
    }
}
