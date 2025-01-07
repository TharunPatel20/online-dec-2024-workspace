import java.util.HashSet;
import java.util.Set;

public class RoomCollectionDemo {

	public static void main(String[] args) {
		Room room1 = new Room(30, 20, 15);
		Room room2 = new Room(60, 30, 25);
		Room room3 = new Room(70, 40, 25);
		Room room4 = new Room(65, 40, 15);
		
		Set<Room> allRooms = new HashSet<>();
		allRooms.add(room1);
		allRooms.add(room2);
		allRooms.add(room3);
		allRooms.add(room4);
		
		allRooms.forEach((eachRoom) -> System.out.println(eachRoom));
		System.out.println("--------");
		Room room5 = new Room(30, 20, 15);
		allRooms.add(room5);
		
		allRooms.forEach((eachRoom) -> System.out.println(eachRoom));
		System.out.println("--------");
	}

}
