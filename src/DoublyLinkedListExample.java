public class DoublyLinkedListExample {
	
	Node head;
	
	 class Node { 
		 
		 int data;
		 Node prev;
		 Node next;
		 
		 Node(int d) {
				
	        data = d; 
	        next = null;
	        prev = null;
		 }
		 
	 }
	  
	public void insertHead(int data) {
		
		Node new_Node = new Node(data);
		
		new_Node.next = head;
		new_Node.prev = null;
		
		if(head != null)
			head.prev = new_Node;
		
		head = new_Node;
		}
	
	public void insertAfter(Node prev_Node, int data) {
		
		if (prev_Node == null)
			System.out.println("Previous node cannot equal null");
		
		Node new_Node = new Node(data);
		
		new_Node.next = prev_Node.next;
		
		prev_Node.next = new_Node;
		
		new_Node.prev = prev_Node;
		
		if (new_Node.next != null)
			new_Node.next.prev = new_Node;
	}
	
	void insertTail(int data) { 
      
        Node new_node = new Node(data); 
  
        Node last = head; 
  
        new_node.next = null; 
  
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
  
        new_node.prev = last; 
    } 
	
	void insertBefore(Node next_Node, int data) {
		
		if (next_Node == null)
			System.out.println("Next node cannot equal null");
		
		Node new_Node = new Node(data);
		
		new_Node.prev = next_Node.prev;
		
		next_Node.prev = new_Node;
		
		new_Node.next = next_Node;
		
		if (new_Node.prev != null)
			new_Node.prev.next = new_Node;
		else
			head = new_Node;
	}
	
	public void printList (Node node) {
		
		Node last = null;
		
		 while (node != null) { 
			 
			 System.out.println(node.data + " ");
			 last = node;
			 node = node.next;
		 }
		 
	}
		 
	public static void main(String[] args) {
		
		DoublyLinkedListExample list = new DoublyLinkedListExample();
		
		// 8
		list.insertHead(8);
		
		// 5, 8
		list.insertHead(5);
		
		// 5, 8, 9
		list.insertTail(9);
		
		// 5, 8, 2, 9
		list.insertAfter(list.head.next, 2);
		
		// 5, 6, 8, 2, 9
		list.insertBefore(list.head.next, 6);
		
		System.out.println("This list has been created: ");
		
		list.printList(list.head);
		
	}
		      
				
} 

