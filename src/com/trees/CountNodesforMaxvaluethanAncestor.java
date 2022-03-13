package com.trees;

import java.util.ArrayList;

class TreeNode1
{
	
	int data;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1(int data)
	{
		this.data=data;
	}
}

public class CountNodesforMaxvaluethanAncestor {
	static TreeNode1 node;
	static int count=0;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		TreeNode1 node = new TreeNode1(4);
		createTree(node);
		solve(node,0);
	}
	public static void createTree(TreeNode1 node)
	{
		node.left = new TreeNode1(5);
		node.right = new TreeNode1(2);
		node.right.left = new TreeNode1(3);
		node.right.right = new TreeNode1(6);
	}
	public static int solve(TreeNode1 node, int max)
	{
		if(node == null)
			return count;
		if(node.data > max)
			count++;
		solve(node.left,Math.max(max, node.data));
		solve(node.right,Math.max(max, node.data));
		return count;
	}
	
}
