
public class MergeTwoSortedLists {
	
	static class Node  { 
	    int data; 
	    Node next; 
	    Node(int d) {data = d; next = null;} 
	} 
	      
	static class MergeLists  { 
	Node head;  
	  
	public void addToLast(Node node)  { 
	    if (head == null) { 
	        head = node; 
	    } 
	    else { 
	        Node temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    } 
	} 
	  
	void printList() { 
	    Node temp = head; 
	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	    System.out.println(); 
	} 
	  
	public static void main(String args[]) { 
	   
	    MergeLists list1 = new MergeLists(); 
	    MergeLists list2 = new MergeLists(); 
	      
	    list1.addToLast(new Node(2)); 
	    list1.addToLast(new Node(5)); 
	    list1.addToLast(new Node(8)); 
	       
	    list2.addToLast(new Node(1)); 
	    list2.addToLast(new Node(3)); 
	    list2.addToLast(new Node(5)); 
	    list2.addToLast(new Node(7));
	      
	    list1.head = new sortList().sortedMerge(list1.head, list2.head); 
	    list1.printList();      
		} 
	} 
	  
	static class sortList { 
	
	Node sortedMerge(Node headA, Node headB) 
	{ 
	      
	    Node dummyNode = new Node(0); 
	      
	    Node tail = dummyNode; 
	    while(true)  { 
	          
	        if(headA == null) { 
	            tail.next = headB; 
	            break; 
	        } 
	        if(headB == null) { 
	            tail.next = headA; 
	            break; 
	        } 
	          
	        if(headA.data <= headB.data) { 
	            tail.next = headA; 
	            headA = headA.next; 
	        }  
	        else { 
	            tail.next = headB; 
	            headB = headB.next; 
	        } 
	        
	        tail = tail.next; 
	    } 
	    return dummyNode.next; 
	    
		} 
	} 
}