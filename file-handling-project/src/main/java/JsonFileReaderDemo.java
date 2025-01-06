import java.io.File;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileReaderDemo {

	public static void main(String[] args) {
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(new File("test.json"));
			int mark = jsonNode.get("studentMark").asInt();
			String firstName = jsonNode.get("studentFirstName").asText();
			String lastName = jsonNode.get("studentLastName").asText();
			System.out.println("Mark : " + mark);
			System.out.println("Full name : " + firstName + " " + lastName);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
