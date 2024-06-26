package trees;

import java.util.LinkedList;
import java.util.Queue;


/**
 Binary tree 
 max 2 children
 1 --> 2  3    2 and 3 are children+
 
 
 
 
 
 
 
 
 
 */
public class PreOrder {
   	static  class Node{
		int data;
		Node left;
		Node right;
		
	  Node(int data){
		  	this.data=data;
	    	this.left=null;
	    	this.right=null;
	   }
	}
		public static class BinaryTree{
			static int idx=-1;
			public Node buildTree(int []nodes ) {
				idx++;
				if(nodes[idx]==-1) {
					return null;
				}
				Node newNode=new Node(nodes[idx]);
				newNode.left=buildTree(nodes);
				newNode.right=buildTree(nodes);
				return newNode;
				
			}
		}
		public static void preOrder(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		public static void inOrder(Node root) {
			if(root==null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
				
		}
		
		
		
		public static void postOrder(Node root) {
			if(root ==null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}

		public static void levelOrder(Node root) {
		if(root==null) {
			return;
		}
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		// keep on looping until the queue is not empty
		while(!q.isEmpty()) {
			Node currNode=q.remove();
			if(currNode==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currNode.data+" ");
				if(currNode.left!=null) {
					q.add(currNode.left);
				}
				if(currNode.right!=null) {
					q.add(currNode.right);
				}
			}
			
		}		
			
	}
		
		public static int countNodes(Node root) {
			if(root==null) {
				return 0;
			}
			int leftNodes=countNodes(root.left);
			int rightNodes=countNodes(root.right);
			return leftNodes+rightNodes+1;
		}
		
		public static int sumOfNodes(Node root) {
			if(root==null) {
				return 0;
			}
			int leftSum=sumOfNodes(root.left);
			int rightSum=sumOfNodes(root.right);
			return leftSum+rightSum+root.data;
		}
	
	
		public static void main(String[] args) {
			BinaryTree tree = new BinaryTree();
			int [] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
			Node root=tree.buildTree(nodes);
			System.out.println(root.data);
			preOrder(root);
			System.out.println();
			inOrder(root);
			System.out.println();
			postOrder(root);
			System.out.println();
			levelOrder(root);
			System.out.println(countNodes(root));
			System.out.println();
			
		}

}
