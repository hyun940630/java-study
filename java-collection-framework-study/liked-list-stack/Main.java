public class Main {
	public static void main(String[] args) {
		LinkedListStack linkedStack = new LinkedListStack();
		
		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);
		linkedStack.push(4);
		linkedStack.push(5);
		
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
	}
}