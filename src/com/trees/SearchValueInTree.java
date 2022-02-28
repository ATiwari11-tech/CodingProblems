package com.trees;

import java.util.ArrayList;

class TreeNode2
{
	
	int data;
	TreeNode2 left;
	TreeNode2 right;
	TreeNode2(int data)
	{
		this.data=data;
	}
}

public class SearchValueInTree {
	static TreeNode2 node;
	static int count=0;
	static boolean isPresent = false;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		TreeNode2 node = new TreeNode2(4);
		createTree(node);
		System.out.println(searchNode(node,7));
	}
	public static boolean searchNode(TreeNode2 node,int val)
	{
		if(node == null)
			return isPresent;
		if(node.data == val)
		{
			isPresent=true;
			return isPresent;
		}
		else
		{
			searchNode(node.left,val);
			searchNode(node.right,val);
		}
		return isPresent;
	}
	public static void createTree(TreeNode2 node)
	{
		node.left = new TreeNode2(5);
		node.right = new TreeNode2(2);
		node.right.left = new TreeNode2(3);
		node.right.right = new TreeNode2(6);
	}
}
