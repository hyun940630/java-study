public class ArrayStack {
	private int top;
	private int maxSize;
	private Object[] stackArray;
	
	// Stack constructor
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	// Check to Empty
	public boolean empty() {
		return (top == -1);
	}
	
	// Check to Full
	public boolean full() {
		return (top == maxSize-1);
	}
	
	// push to Stack
	public void push(Object item) {
		if(full()) throw new ArrayIndexOutOfBoundsException((top+1) + " >= " + maxSize);
		stackArray[++top] = item;
	}
	
	// Return top data of Stack
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException(top);
		return stackArray[top];
	}
	
	// Remove top data of Stack
	public Object pop() {
		Object item = peek();
		top--;
		return item;
	}
	
	// print Array Stack
		public String toString() {
			String str = "[";
			for (int i = 0; i < maxSize; i++) {
				str += stackArray[i];
				if (i < maxSize - 1) {
					str += ", ";
				}
			}
			return str + "]";
		}
}
