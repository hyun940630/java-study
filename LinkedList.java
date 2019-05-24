public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	// Add node to First position
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}
	
	// Add node to last position
	public void addLast(Object input) {
		Node newNode = new Node(input);
		
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++)
			x = x.next;
		return x;
	}
	
	// Add node
	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	// print list
	public String toString() {
		if (head == null) {
			return "[]";
		}
		
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		
		str += temp.data;
		return str + "]";
	}
	
	// Remove First position node
	public Object removeFirst() {
		Node temp = head;
		head = temp.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	// Remove node
	public Object remove(int k) {
		if (k == 0)
			return removeFirst();
		Node temp = node(k - 1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// Get list size
	public int size() {
		return size;
	}
	
	// Get element data
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	// Find a element index
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			
			if(temp == null)
				return -1;
		}
		return index;
	}
}