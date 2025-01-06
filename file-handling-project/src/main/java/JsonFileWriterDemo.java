import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonFileWriterDemo {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode jsonNode = objectMapper.createObjectNode();
		jsonNode.put("studentFirstName", "Harry");
		jsonNode.put("studentLastName", "Potter");
		jsonNode.put("studentMark", 70);
		try {
			objectMapper.writeValue(new File("test.json"), jsonNode);
			System.out.println("Write over...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
