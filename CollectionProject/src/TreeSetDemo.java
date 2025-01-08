import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> allCountries = new TreeSet<>();
		allCountries.add("India");
		allCountries.add("SriLanka");
		allCountries.add("Pakistan");
		allCountries.add("Nepal");
		allCountries.add("China");
		allCountries.add("Pakistan");
		
		allCountries.forEach((eachCty) -> System.out.println(eachCty));
		
		System.out.println("----------");
//		SortedSet<String> allColors = new TreeSet<>((c1, c2) -> c2.compareTo(c1));
		SortedSet<String> allColors = new TreeSet<>(Collections.reverseOrder());
		allColors.add("RED");
		allColors.add("BLUE");
		allColors.add("GREEN");
		allColors.add("PURPLE");
		
		allColors.forEach((eachColor) -> System.out.println(eachColor));
	}

}
