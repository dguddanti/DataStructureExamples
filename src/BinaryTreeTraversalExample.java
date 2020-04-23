
public class BinaryTreeTraversalExample {
	
	static class Node {
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	static class BinaryTree {
		Node root;
		
		BinaryTree(int key) {
			root = new Node(key);
		}
		
		BinaryTree() {
			root = null;
		}
		
		public void inOrder(Node node) {
			if (node != null) {
				inOrder(node.left);
				System.out.print(" " + node.key);
				inOrder(node.right);
			}
		}

		public void preOrder(Node node) {
			if (node != null) {
				System.out.print(" " + node.key);
				preOrder(node.left);
				preOrder(node.right);
			}
		}
		
		
		public void postOrder(Node node) {
			if (node != null) {
				postOrder(node.left);
				postOrder(node.right);
				System.out.print(" " + node.key); 
			}
		}
		
		void inOrder() { 
			inOrder(root); 
		}
		
		void preOrder() { 
			preOrder(root); 
		}
		
		void postOrder() { 
			postOrder(root); 
		}
		
		public static void main(String[] args) {
			BinaryTree tree = new BinaryTree();
			
			tree.root = new Node(5);
			
			tree.root.left = new Node(3);
			tree.root.right = new Node(8);
			
			tree.root.left.left = new Node(1);
			tree.root.left.right = new Node(4);
			tree.root.right.left = new Node(7);
			tree.root.right.right = new Node(10);
			
			System.out.println("In order traversal of tree: ");
			tree.inOrder();
			
			System.out.println("\nPre order traversal of tree: ");
			tree.preOrder();
			
			System.out.println("\nPost order traversal of tree: ");
			tree.postOrder();
		}
	}

}
