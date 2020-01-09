
public class Queue {
	
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.queueArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long element) {
		if(rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = element;
		nItems++;
	}
	
	public long remove() {
		long frontElement = queueArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return frontElement;
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void viewElementsINQueue() {
		System.out.println("[");
		for(int i = 0; i< queueArray.length; i++) {
			System.out.println(queueArray[i]);
		}
		System.out.println("]");
	}

}
