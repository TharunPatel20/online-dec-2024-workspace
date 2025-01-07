import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> allNumbers = new HashSet<>();
		
		// C - Create
		allNumbers.add(2);
		allNumbers.add(4);
		allNumbers.add(6);
		allNumbers.add(5);
		allNumbers.add(7);
		allNumbers.add(8);
		allNumbers.add(9);
		allNumbers.add(2);
		
		// R - Read
		for(Integer eachNumber: allNumbers) {
			System.out.println(eachNumber);
		}
		System.out.println("---------");
		
		// U - Update
		allNumbers.remove(8);
		allNumbers.add(18);
		Iterator itr = allNumbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------");
		
		// remove all the elements of the HashSet
		//allNumbers.removeAll(allNumbers);
		allNumbers.clear();
		System.out.println("Is Empty?" + allNumbers.isEmpty());
		
		// compare 2 hashsets and keep the common elements
		Set<String> allColors1 = new HashSet<String>();
		allColors1.add("RED");
		allColors1.add("BLUE");
		allColors1.add("GREEN");

		Set<String> allColors2 = new HashSet<String>();
		allColors2.add("BLACK");
		allColors2.add("PURPLE");
		allColors2.add("GREEN");
		allColors2.add("PINK");
		
		allColors1.retainAll(allColors2);
		allColors1.forEach((eachColor)->System.out.println(eachColor));
		
		
	}

}
