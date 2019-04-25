import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
	public static void main(String[] args) {
		// java 8 : HashMap
		Map <String, Integer> productPrice = new HashMap<>();
		
		// add Value
		productPrice.put("Rice", 7);
		productPrice.put("Flour", 4);
		productPrice.put("Sugar", 5);
		
		// get Value
		int sugar = productPrice.get("Sugar");
		System.out.println("The price of Sugar is " + sugar + ".");
	}

}