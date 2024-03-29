//Given a binary tree, calculate no. of nodes at distance K from root
//TC -> O(min(N,2^k)
//SC -> O(min(h,k))
//In Below tree example answer would be 3 since at level 2 we have node 1,7 and 15
package com.trees;

import com.sun.source.tree.Tree;

public class NoOfNodesAtDistanceKFromRoot {
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(11);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(15);
        int k = 2;
        System.out.println("No. Of Nodes At Distance K from Root:");
        System.out.println(countNodesAtDisK(node,0,k));
    }
    public static int countNodesAtDisK(TreeNode node,int level,int k){
        if(node == null)
            return 0;
        if(level == k) {
            System.out.print(node.data+",");
            return 1;
        }
        System.out.println();
        return countNodesAtDisK(node.left,level+1,k) + countNodesAtDisK(node.right,level+1,k);
    }
}
