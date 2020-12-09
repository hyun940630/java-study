import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

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
		
		// print all the keys
		Set <String> keys = productPrice.keySet();
		
		for (String key : keys)
			System.out.println(key);
		// or (Lambda expression)
		keys.forEach(key -> System.out.println(key));
		
		// print all the Values
		Collection <Integer> values = productPrice.values();
		values.forEach(value -> System.out.println(values));
		
		// print all the keys and value
		Set <Map.Entry<String, Integer>> entries = productPrice.entrySet();
		
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.print("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
		// or (Lambda Expression)
		productPrice.forEach((key, value) -> {
			System.out.print("Key : " + key);
			System.out.println("Value : " + value);
		});
	}
}