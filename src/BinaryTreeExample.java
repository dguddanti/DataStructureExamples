
public class BinaryTreeExample {
	
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
		
		public static void main(String[] args) {
			BinaryTree tree = new BinaryTree();
			
			tree.root = new Node(10);
			
			tree.root.left = new Node(20);
			tree.root.right = new Node(30);
			
			tree.root.left.left = new Node(40);
		}
	}
}
