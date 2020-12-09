public class Main {
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		
		arrList.addLast(10);
		arrList.addLast(20);
		arrList.addLast(30);
		arrList.addLast(40);
		arrList.add(1, 15);
		arrList.addFirst(5);
		arrList.remove(1);
		arrList.removeFirst();
		arrList.removeLast();
		
		// print List
		System.out.println(arrList);
		
		// get data
		System.out.println(arrList.get(2));
		
		// size
		System.out.println(arrList.size());
		
		// find a index value of a specific value
		System.out.println(arrList.indexOf(20));
	}
}
