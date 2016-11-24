package DataStructures.LinkedList;

public class Reverse {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
		
	}
	
	
	public static void main(String[] args) {
		Node root = new Reverse().createList();
		new Reverse().printList(root);
		System.out.println("");
		root = new Reverse().reverseWithoutAnewList(root);
		new Reverse().printList(root);
	}
	
	private void printList(Node root){
		Node temp = root;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	private Node createList(){
		
		Node root = new Node(5);
		insert(root,new Node(6));
		insert(root,new Node(1));
		insert(root,new Node(3));
		insert(root,new Node(4));
		insert(root,new Node(8));
		insert(root,new Node(9));		
		return root;
	}
	
	private Node reverseWithNewList(Node head) {

	    Node n1 = null;  
	        
	    while(head!=null){  
	        Node n2 = new Node(head.data);
	        n2.next = n1;
	        n1 = n2;
	        head=head.next;
	    }
	    
	    return n1;
	    
	}
	
	private Node reverseWithoutAnewList(Node head) {

	    Node prev = null;
	    Node cur = head;
	    Node next=null;
	    while(cur!=null){  
	        next = cur.next;
	        cur.next = prev;
	        prev = cur;
	        cur=next;
	    }
	    
	    head = prev;
	    return head;	    
	    
	}
	
	private void insert(Node root,Node n){
		
		if(root==null)
			root = n;
		
		Node temp = root;
		
		while(temp.next!=null){
			temp = temp.next;			
		}
	    
		temp.next = n;
		
	}

}
