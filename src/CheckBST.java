
public class CheckBST {
	
	static class Node { 
	    int data; 
	    Node left, right; 
	      
	    Node(int data) 
	    { 
	        this.data = data; 
	        left = right = null; 
	    } 
	}
	
	static Node prev; 
	  
	static boolean isBST(Node root) { 
	    if (root != null) 
	    { 
	        if (!isBST(root.left)) 
	        return false; 
	   
	        if (prev != null && root.data <= prev.data) 
	        return false; 
	  
	        prev = root; 
	  
	        return isBST(root.right); 
	    } 
	    return true; 
	} 
	  
	static boolean ifBST(Node root) 
	{ 
	    return isBST(root); 
	} 

	public static void main(String[] args) {
		Node root = new Node(5);
		
		root.left = new Node(3);
		root.right = new Node(8);
		
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.right.left = new Node(7);
		root.right.right = new Node(10);
		
		if (ifBST(root))
			System.out.println("Is a Balanced Search Tree");
		else 
			System.out.println("Is not a Balanced Search Tree");
	}
}
