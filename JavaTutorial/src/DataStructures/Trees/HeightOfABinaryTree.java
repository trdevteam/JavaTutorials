package DataStructures.Trees;


public class HeightOfABinaryTree {

	class Node{
		int value;
		Node left;
		Node right;
		public Node(int value){
			this.value = value;
		}
	}
	
	public static void main(String[] ar){
		
		Node root = new HeightOfABinaryTree().createTree();		

	    System.out.println(new HeightOfABinaryTree().getHeight(root));
	    
	    System.out.println(new HeightOfABinaryTree().getLongestpath(root));
	    
	}
	
	private int getHeight(Node n){
		
		if(n==null)
			return 0;		
		else if(getHeight(n.left)>getHeight(n.right)){
			return 1 + getHeight(n.left);		
		}else{
			return 1 + getHeight(n.right);	
		}
	}
	
	private int getLongestpath(Node n){
		
		if(n==null)
			return 0;		
		else if(getHeight(n.left)>getHeight(n.right)){
			System.out.print(n.left.value + " ");
			 return 1+ getHeight(n.left);		
		}else{
			System.out.print(n.right.value+" ");
			  return 1+ getHeight(n.right);	
		}
	}
	
	private Node createTree(){
		
	    Node  root= new Node(100);
	    System.out.println("Binary Tree Example");
	    System.out.println("Building tree with root value " + root.value);
	    insert(root, 200);
	    insert(root, 90);
	    insert(root, 80);
	    insert(root, 70);
	    insert(root, 81);
	    insert(root, 82);
	    insert(root, 83);
	    insert(root, 84);
	    insert(root, 85);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
	    insert(root, 101);
		
	    return root;
	}
	
	private void insert(Node n,int value){
		
		if(value<n.value){
			
			if(n.left==null){				
				n.left=new Node(value);
			}else{
				insert(n.left,value);
			}			
		}else{
			
			if(n.right==null){
				n.right = new Node(value);
			}else{
				insert(n.right,value);
			}
			
		}
		
	}
	
}
