//Given a Binary Tree, Find Least Common Ancestor of two nodes i.e. x and y
//TC -> O(N)
//SC -> O(H)
package com.trees;

import java.util.ArrayList;
import java.util.List;

public class LCAInBInaryTree {
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    public static void main(String args[]){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(11);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(15);
        int x = 1;
        int y = 11;
        getPath(node,x,list1);
        getPath(node,y,list2);
        System.out.println("LCA of this binary tree is:");
        System.out.println(getLCA(list1,list2));
    }
    public static boolean getPath(TreeNode node,int val,List<Integer> list1){
        if(node == null)
            return false;
        list1.add(node.data);
        if(node.data == val)
            return true;
        if(getPath(node.left,val,list1) || getPath(node.right,val,list1))
            return true;
        list1.remove(list1.get(list1.size()-1));
        return false;
    }

    public static int getLCA(List<Integer> list1, List<Integer> list2){
        int x = list1.size();
        int y = list2.size();
        int i=0,j=0;
        while(i < x || j < y){
            if(list1.get(i) != list2.get(j))
                return list1.get(i-1);
            i++;
            if(j < y)
                j++;
        }
        return 0;
    }
}
