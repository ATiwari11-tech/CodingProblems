//Given a binary tree, print left view of tree i.e. print only the first node of every level
//if there are both left and right node form level 1 then only left node will be printed as right will be
//shadowed from the left node but if only right node is present then that node should get printed
//level0 any ways will have only 1 node i.e. root so that will always come

//Example for the given input below
//Output should be -> 3,5,9,1

//TC -> O(N)
//SC -> O(width of tree) i.e. O(N) at any level the maximum number of nodes because   List<List<TreeNode>> plist and
//List<List<Integer>> result is expected in the result there doesn't take into account as extra space

package com.trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class PrintLeftViewOfTree {
    public static void main(String args[]){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(9);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.left.left = new TreeNode(1);
        System.out.println("Left View Tree Nodes are:");
        List<List<Integer>> result = printLeftView(node);
        for(List<Integer> res:result)
            System.out.println(res);
    }
    public static List<List<Integer>> printLeftView(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<TreeNode>> plist = new ArrayList<List<TreeNode>>();
        List<List<Integer>> parentListInt = new ArrayList<List<Integer>>();
        q.add(node);
        while(!q.isEmpty()) {
            int size = q.size();
            TreeNode left = null;
            TreeNode right = null;
            List<TreeNode> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode root = q.peek();
                if(i==0)//Condition to ensure it's picking only the first node of the level
                    res.add(root);
                left = root.left;
                right = root.right;
                if(left != null)
                    q.add(left);
                if(right != null)
                    q.add(right);
                q.remove();
            }
            plist.add(res);
        }
        for(List<TreeNode> pnode:plist){
            List<Integer> dataList = new ArrayList<>();
            for(TreeNode node1:pnode){
                dataList.add(node1.data);
            }
            parentListInt.add(dataList);
        }
        return parentListInt;
    }
}
