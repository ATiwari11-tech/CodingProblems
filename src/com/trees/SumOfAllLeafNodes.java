package com.trees;

import java.util.ArrayList;

class TreeNode
{
	
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data)
	{
		this.data=data;
	}
}

public class SumOfAllLeafNodes {
	static TreeNode node;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		int sum=0;
		createTree(node);
		result = solve(node);
		for(int num:result)
		{
			sum+=num;
		}
		System.out.println("SUm="+sum);
	}
	public static void createTree(TreeNode node)
	{
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(5);
	}
	public static ArrayList<Integer> solve(TreeNode node)
	{
		if(node == null)
			return result;
		solve(node.left);
		solve(node.right);
		if(node.left == null && node.right == null)
			result.add(node.data);
		return result;
	}
}
