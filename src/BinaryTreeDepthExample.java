public class BinaryTreeDepthExample {
	
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
		
		int maxDepth(Node node) {
			
			if (node == null)
				return 0;
			else {
				int lDepth = maxDepth(node.left); 
	            int rDepth = maxDepth(node.right); 
	            
	            if (lDepth > rDepth)
	            	return (lDepth + 1);
	            else
	            	return (rDepth + 1);
			}
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
			
			System.out.println("Tree Height: " + tree.maxDepth(tree.root));
		}
	}
}
