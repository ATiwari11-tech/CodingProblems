//Given a binary tree, print level order traversal i.e. print level by level
//Idea is to use queue i.e. enqueue and dequeue
//TC -> O(N) -> Every element in the tree is scanned only once
//SC -> O(N) -> At any level maximum number of nodes may get into queue would be N/2 elements
package com.trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLOTInNewLine {
    public static void main(String args[]){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(9);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.left.left = new TreeNode(1);
        List<List<Integer>> plist = printLOTInNewLine(node);
        System.out.println("Level Order Traversal in New Lines");
        for(List<Integer> list:plist){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> printLOTInNewLine(TreeNode node){
        List<List<TreeNode>> parentList = new ArrayList<List<TreeNode>>();
        List<List<Integer>> parentListInt = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode left = null;
            TreeNode right = null;
            List<TreeNode> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode root = q.peek();
                left = root.left;
                right = root.right;
                list.add(root);
                if(left != null)
                    q.add(left);
                if(right != null)
                    q.add(right);
                q.remove();
            }
            parentList.add(list);
        }
        for(List<TreeNode> tnode:parentList){
            List<Integer> result = new ArrayList<>();
           for(TreeNode node1: tnode){
               result.add(node1.data);
           }
            parentListInt.add(result);
        }
        return parentListInt;
    }
}
