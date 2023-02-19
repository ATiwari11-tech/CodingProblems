//Given a preorder and inrorder traversal of tree, construct binary tree
//given array of preorder and in order

//TC->O(N^2) because of for loop inside,SC->O(1)
//To improve above create hashmap of array elements with index and value as key and value pair
//Improved tc -> O(N), SC-> O(H+N), H is height of tree becuase of recursion and N is size of map so SC should be O(N)

package com.trees;

import com.sun.source.tree.Tree;

public class ConstructTreeGivenPreAndIn {
    public static void main(String args[]){
        int pre[] = {8,6,3,1,4,2,5,7};
        int in[] = {3,6,1,8,5,2,4,7};
        int prelen = pre.length;
        int inlen = in.length;
        TreeNode node = cbt(pre,in,0,prelen-1,0,inlen-1);
        System.out.println("Desired root node:"+node.data);
        System.out.println("Desired root left node:"+node.left.data);
        System.out.println("Desired root right node:"+node.right.data);
        System.out.println("Desired root left left node:"+node.left.left.data);
    }
    public static TreeNode cbt(int []pre,int []in,int ps,int pe,int is,int ie){
        if(ps > pe)
            return null;
        int rootval = pre[ps];
        int id=0;
        TreeNode root = new TreeNode(rootval);//first element of preorder array will be root
        //find root val in inorder array
        for(int i=0;i< in.length;i++){
            if(in[i] == rootval) {
                id = i;
                break;
            }
        }
        root.left = cbt(pre,in,ps+1,ps+id-is,is,id-1);
        root.right = cbt(pre,in,ps+id-is+1,pe,id+1,ie);
        return root;
    }
}
