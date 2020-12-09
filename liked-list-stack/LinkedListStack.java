public class LinkedListStack {
	private Node top;
	
	private class Node {
		private Object data;
		private Node nextNode;
		
		Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}
	
	// Stack constructor
	public LinkedListStack() {
		this.top = null;
	}
	
	// Check to empty
	public boolean empty() {
		return (top == null);
	}
	
	// Push item into top position
	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = top;
		top = newNode;
	}
	
	// Return top node of Stack data
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		return top.data;
	}
	
	// Remove top node of Stack
	public Object pop() {
		Object item = peek();
		top = top.nextNode;
		return item;
	}
}

