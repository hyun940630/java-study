
public class Main {
	public static void main(String[] args) {
		ArrQueue arrQueue = new ArrQueue(4);
		arrQueue.enQueue("Hello");
		arrQueue.enQueue(5);
		arrQueue.enQueue("queue");
		
		while(!arrQueue.isEmpty()) {
			System.out.println(arrQueue.deQueue());
		}
	}
}
