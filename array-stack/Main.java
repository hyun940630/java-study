public class Main {
	public static void main(String[] args) {
		ArrayStack arrStack = new ArrayStack(5);
		
		arrStack.push(1);
		arrStack.push(2);
		arrStack.push(3);
		arrStack.push(4);
		
		System.out.println(arrStack);
		
		System.out.println("pop() : " + arrStack.pop());
		System.out.println(arrStack);
		
		System.out.println(arrStack.peek());
	}
}
