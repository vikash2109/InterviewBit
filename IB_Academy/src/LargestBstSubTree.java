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
