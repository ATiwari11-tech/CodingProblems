//Given a binary tree, print level order traversal i.e. print level by level but from right to left
//For the given input, output should be-> 3,7,5,8,6,9,1
package com.trees;

import java.util.ArrayList;
import java.util.List;

public class PrintLOTFromRightToLeft {
    public static void main(String args[]){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(9);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.left.left = new TreeNode(1);
        System.out.println("LOT Traversal Nodes from Right to Left:"+printLOT(node));
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
            if (right != null)
                list.add(right);
            if (left != null)
                list.add(left);
            f++;
            size = list.size();
        }
        for(TreeNode node1:list){
            dataList.add(node1.data);
        }
        return dataList;
    }
}
