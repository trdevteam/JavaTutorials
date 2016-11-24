package DataStructures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {


	public class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
		
	}
	
	
	public static void main(String[] args) {
		Node root = new BFS_DFS().createTree();
		BFS(root);
		System.out.println("");
		DFS(root);
		System.out.println("");
		System.out.println(getHeight(root));
		getMaxLenthPath(root);
		System.out.println("");
		findTheLowestAncestor(root, 1, 9);	
		Node ancestor=theLowestAncestorRecurcive(root,1,9);
		System.out.print(ancestor.data+"aaa");
	}
	
	private static Node theLowestAncestorRecurcive(Node root,int v1,int v2)
	{
	    if(root.data < v1 && root.data < v2){
	         return theLowestAncestorRecurcive(root.right,v1,v2);
	    }
	    
	    if(root.data > v1 && root.data > v2){
	        return theLowestAncestorRecurcive(root.left,v1,v2);
	    }

	    return root;
	}
	
	private static boolean getPath(Node rootNode, int key, ArrayList<Node> path ){
	    //return true if the node is found
	    if( rootNode==null)
	        return false;
	    if (rootNode.data==key){
	        path.add(rootNode);
	        return true;
	    }
	    boolean left_check = getPath( rootNode.left,key,path);
	    boolean right_check = getPath( rootNode.right,key,path);
	    if ( left_check || right_check){
	        path.add(rootNode);
	        return true;
	    }
	    return false;

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
		insert(root,1);
//		insert(root,11);
//		insert(root,20);
//		insert(root,40);
//		insert(root,50);
//		insert(root,60);
//		insert(root,70);
//		insert(root,61);
//		insert(root,65);
//		insert(root,63);
//		insert(root,62);
		
		return root;
				
	}
	
	private void insert(Node root,int data){
		
		if(root.data>data){
			
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
	
	private static void DFS(Node root){
		
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while (!s.isEmpty()) {
			Node x = s.pop();
			
			if(x.right!=null) 
				s.add(x.right);
			if(x.left!=null) 
				s.add(x.left);		
			
			System.out.print(" " + x.data);
		}	
		
	}
	
	private static void findTheLowestAncestor(Node root,int x,int y){
		
		ArrayList<Node>pathX = new ArrayList<Node>();
		getPath(root,9,pathX);
		
		ArrayList<Node> pathY = new ArrayList<Node>();
		getPath(root,1,pathY);
		
		boolean isFound=false;
		
		for(Node n1:pathX){

			for(Node n2:pathY){
				
				if(n1==n2 && !isFound){
					System.out.println(n1.data);
					isFound = true;
					break;
				}
				
			}
			
		}
		
		
	}
	
	
	private static void getMaxLenthPath(Node root){
		
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while (!s.isEmpty()) {
			Node x = s.pop();
			
			if(x.right!=null && x.left!=null){
				if(getHeight(x.left)>getHeight(x.right)){
					s.add(x.left);
				}else{
					s.add(x.right);
				}
			}else if(x.right!=null){
				s.add(x.right);
			}else if(x.left!=null){
				s.add(x.left);
			}		
			
			System.out.print(" " + x.data);
		}	
		
	}
	
	private static void BFS(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(" " + n.data);
			if (n.left != null) 
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
		
	}
	
	private static int getHeight(Node root){
		
		if(root==null)
			return 0;
		
		return 1+Math.max(getHeight(root.left), getHeight(root.right));		
		
	}
	
}
