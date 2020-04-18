
public class QueueLinkedListExample {
	
	static class QNode {
		int key;
		QNode next;
		
		public QNode(int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	static class Queue {
		QNode front, rear;
		
		public Queue() {
			this.front = this.rear = null;
		}
		
		void enqueue(int key) {
			QNode temp = new QNode(key);
			
			if (this.rear == null) { 
	            this.front = this.rear = temp; 
	            return; 
	        }
			
			this.rear.next = temp;
			this.rear = temp;
		}
		
		void dequeue() {
			
			if (this.front == null)
				return;
			
			QNode temp = this.front;
			this.front = this.front.next;
			
			if(this.front == null)
				this.rear = null;
		}
	}


	public static class Test {	
	
		public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		q.dequeue();
		q.enqueue(4);
		
		System.out.println("Queue Front: " + q.front.key);
		System.out.println("Queue Rear: " + q.rear.key);

		}
	}
}
