public class LinkedListExample { 

	Node head; 
	
	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	
	public static LinkedListExample insert(LinkedListExample list, int data) { 
		Node new_node = new Node(data); 
		new_node.next = null; 

		if (list.head == null) { 
			list.head = new_node; 
		} 
		
		else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
		} 

		return list; 
	} 
	
	public static void printList (LinkedListExample list) {
		Node currNode = list.head;
		
		System.out.println("Linked List: ");
		
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			
			currNode = currNode.next;
		}
	
		System.out.println();
	}
	
	public static LinkedListExample deleteByKey(LinkedListExample list, int key) { 
		
		Node currNode = list.head, prev = null; 

		if (currNode != null && currNode.data == key) { 
			list.head = currNode.next; 

			System.out.println(key + " has been deleted from list"); 
 
			return list; 
		} 

		while (currNode != null && currNode.data != key) { 
			prev = currNode; 
			currNode = currNode.next; 
		} 

		if (currNode != null) {  
			prev.next = currNode.next; 

			System.out.println(key + " has been deleted from list"); 
		} 

		if (currNode == null) {  
			System.out.println(key + " not found in list"); 
		} 

		return list; 
	} 

	public static void main(String[] args) { 
		LinkedListExample list = new LinkedListExample(); 

		list = insert(list, 8); 
		list = insert(list, 22); 
		list = insert(list, 4); 
		list = insert(list, 7); 
		list = insert(list, 62); 
		list = insert(list, 353); 
		list = insert(list, 9); 
		list = insert(list, 0); 

		printList(list); 

		deleteByKey(list, 8); 
		
		printList(list); 

		deleteByKey(list, 62); 

		printList(list); 

		deleteByKey(list, 220); 

		printList(list); 
	} 
} 

	
	

