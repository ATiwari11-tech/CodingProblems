package com.trees;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeafNodes {
    static List<Integer> result = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        result = solve(node);
        int sum = 0;
        for(int num:result)
        {
            sum += num;
        }
        System.out.println("Sum of all leaft nodes:"+sum);
    }
    public static List<Integer> solve(TreeNode node){
        if(node == null)
            return result;
        solve(node.left);
        solve(node.right);
        if(node.left == null && node.right == null)
            result.add(node.data);
        return result;
    }
}
