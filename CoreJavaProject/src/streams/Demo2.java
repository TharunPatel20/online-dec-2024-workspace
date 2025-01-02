package streams;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> cities = List.of("Chennai", "Mumbai", "Pune", "Kolkatta");
		
		// convert each cities to upper case and store it in another collection
		List<String> transformedCities = cities
											.stream()
											.map((eachCity)-> eachCity.toUpperCase())
											.toList();
		transformedCities.stream().forEach((city)->System.out.println(city));
		System.out.println("-----------");
		// filter cities starting with 'c' or 'C' and print on the console
		cities
			.stream()
			.filter((eachCity)->eachCity.startsWith("c") || eachCity.startsWith("C"))
			.forEach((city) -> System.out.println(city));
		System.out.println("-----------");
		// sort the city and print it on the console
		cities.stream().sorted().forEach((city) -> System.out.println(city));
		System.out.println("-----------");
		// find the count of cities
		long numberOfCities = cities.stream().count();
		System.out.println(numberOfCities);
		
	}

}
