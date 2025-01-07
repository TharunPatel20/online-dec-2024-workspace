import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> allCities = new ArrayList<>();
		
		// C R U D
		
		// C - Create
		allCities.add("Chennai");
		allCities.add("Mumbai");
		allCities.add("Pune");
		allCities.add("Kolkatta");
		
		// R - Read
		for(int i=0;i<allCities.size();i++) {
			System.out.println(allCities.get(i));
		}
		System.out.println("--------------");
		
		// U - Update
		int index = allCities.indexOf("Kolkatta");
		allCities.set(index, "Calcutta");
		for(String eachCity : allCities) {
			System.out.println(eachCity);
		}
		System.out.println("--------------");
		
		// D - Delete
		allCities.remove("Pune");
		allCities.forEach((eachCity) -> System.out.println(eachCity));
		
	}

}
