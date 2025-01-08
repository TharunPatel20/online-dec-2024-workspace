import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<>();
		
		// C - Create
		phoneBook.put("Ram", 2222222222L);
		phoneBook.put("Priya", 3333333333L);
		phoneBook.put("Raj", 5555555555L);
		
		// R - Read
		Set<String> allKeys = phoneBook.keySet();
		Iterator<String> itr = allKeys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " : " + phoneBook.get(key));
		}
		System.out.println("----------");
		
		// U - Update
		phoneBook.put("Priya", 1111111111L);
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("----------");
		
		// D - Delete
		phoneBook.remove("Ram");
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("----------");
	}	
}
