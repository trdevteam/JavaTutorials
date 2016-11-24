package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_BFS {


	public class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
		
	}
	
	
	public static void main(String[] args) {
		Node root = new LevelOrder_BFS().createTree();
		LevelOrder(root);
	}
	
	private Node createTree(){
		
		Node root = new Node(10);
		
		insert(root,3);
		insert(root,13);
		insert(root,4);
		insert(root,5);
		insert(root,8);
		insert(root,9);
		insert(root,23);
		insert(root,32);
		insert(root,12);
		insert(root,2);
		insert(root,7);
		insert(root,8);
		
		return root;
				
	}
	
	private void insert(Node root,int data){
		
		if(root.data<data){
			
			if(root.left==null)
				root.left = new Node(data);
			else{
				insert(root.left,data);
			}
			
		}else{
			
			if(root.right ==null)
				root.right= new Node(data);
			else
				insert(root.right,data);
			
		}
		
	}
	
	
	private static void LevelOrder(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			System.out.print(" " + n.data);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
		
	}
	
}
