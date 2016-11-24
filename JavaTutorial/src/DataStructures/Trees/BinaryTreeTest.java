package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTest {

	  public static void main(String[] args) {
	    new BinaryTreeTest().run();
	  }

	  static class Node {
	    Node left;

	    Node right;

	    int value;

	    public Node(int value) {
	      this.value = value;
	    }
	  }

	  public void run() {
	    // build the simple tree from chapter 11.
	    Node root = new Node(5);
	    System.out.println("Binary Tree Example");
	    System.out.println("Building tree with root value " + root.value);
	    insert(root, 1);
	    insert(root, 8);
	    insert(root, 6);
	    insert(root, 3);
	    insert(root, 9);
	    System.out.println("Traversing tree in order");
	    printInOrder(root);
	    System.out.println("Traversing tree post order");
	    postOrder(root);
	    System.out.println("Traversing tree front-to-back from location 7");
	    printFrontToBack(root, 7);
	    System.out.println(checkBST(root));
	  }
	  
	  private boolean checkBST(Node root){
		  		  
		  Queue<Node> q = new LinkedList<Node>();	
		  
		  inOrderTraversal(root,q);
		  
		  boolean isBST=true;		  
		  		  
		  while(!q.isEmpty()){
			  
			  Node n1 = q.poll();
			  
			  if(q.isEmpty())
				  break;
			  
			  Node n2 = q.peek();
			  
			  if(n1.value>=n2.value){
				  isBST = false;
				  break;
			  }					  
			  
		  }	
		  
		  return isBST;		  
		  
	  }
	  
	  
	  private void inOrderTraversal(Node root,Queue<Node> q){
		  
		  if(root==null)
			  return;
		  if(root.left!=null)
			  inOrderTraversal(root.left,q);
		  
		  q.add(root);
		  
		  if(root.right!=null)
			  inOrderTraversal(root.right, q);		  
		  
	  }
	  
	  
	  
	  public void insert(Node node, int value) {
	    if (value < node.value) {
	      if (node.left != null) {
	        insert(node.left, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.value);
	        node.left = new Node(value);
	      }
	    } else if (value > node.value) {
	      if (node.right != null) {
	        insert(node.right, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.value);
	        node.right = new Node(value);
	      }
	    }
	  }

	  public void printInOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.left);
	      System.out.println("  Traversed " + node.value);
	      printInOrder(node.right);
	    }
	  }
	  
	  public void preOrder(Node node) {
	    if (node != null) {
		  System.out.println("  Traversed " + node.value);
	      preOrder(node.left);
	      preOrder(node.right);
	    }
	   }
		  
	  
	  public void postOrder(Node node) {
		    if (node != null) {
		      postOrder(node.left);
		      postOrder(node.right);
		      System.out.println("  Traversed " + node.value);
		    }
		}
	  

	  /**
	   * uses in-order traversal when the origin is less than the node's value
	   * 
	   * uses reverse-order traversal when the origin is greater than the node's
	   * order
	   */
	  public void printFrontToBack(Node node, int camera) {
	    if (node == null)
	      return;
	    if (node.value > camera) {
	      // print in order
	      printFrontToBack(node.left, camera);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.right, camera);
	    } else if (node.value < camera) {
	      // print reverse order
	      printFrontToBack(node.right, camera);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.left, camera);
	    } else {
	      // order doesn't matter
	      printFrontToBack(node.left, camera);
	      printFrontToBack(node.right, camera);
	    }
	  }

	}
