/*
 Largest BST Subtree
Given a binary tree. Find the size of largest subtree which is a Binary Search Tree (BST), where largest means subtree with the largest number of nodes in it. Note: A subtree must include all of its descendants. For Example
Input 1:
                     10
                    / \
                   5  15
                  / \   \ 
                 1   8   7
Output 1:
    3
    Explanation 1:
        Largest BST subtree is
                            5
                           / \
                          1   8

Input 2:
                5
               / \
              3   8
             / \ / \
            1  4 7  9
Output 2:
     7
     Explanation 2:
        Given binary tree itself is BST.
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
      val = x;
      left=null;
      right=null;
     }
 }

public class LargestBstSubTree {
	class Node{
        int min,max,size;
        boolean isBst;
        
        Node(int min,int max,int size,boolean isBst){
            this.min=min;
            this.max=max;
            this.isBst=isBst;
            this.size=size;
        }
    }
    
    public int solve(TreeNode A) {
       return helper(A).size;
    }
    
    Node helper(TreeNode node){
        
        if(node==null) return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        
        // perform PostOrder Traversal (i.e LRN) in tree and check for BST conditions
        
        Node left=helper(node.left);
        Node right= helper(node.right);
        
        if(!left.isBst || !right.isBst){  //instead of INTmax and INTmin you can use -1 in both the places.
            return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.size, right.size),false);
        }
        
        int val= node.val;
        int leftMax=left.max;
        int rightMin= right.min;
        
        if(val>leftMax && val<rightMin)
            return new Node(val,val,1+left.size+right.size ,true);
        
        return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.size, right.size),false);
    }

}
