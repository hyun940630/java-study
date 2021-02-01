public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addLast(5);
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);
		
		System.out.println("Linked List " + linkedList);
		
		System.out.println("Remove first node : " + linkedList.removeFirst());
		System.out.println("Remove index=2 node : " + linkedList.remove(2));
		
		System.out.println("Current Linked List " + linkedList);
		System.out.println("Current Linked List size : " + linkedList.size());
		
		System.out.println("Get element >> index(0) = " + linkedList.get(0));
		System.out.println("Find a element index value >> data(10) = " + linkedList.indexOf(10));
	}
}