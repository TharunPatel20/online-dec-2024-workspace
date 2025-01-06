import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLFileWriterDemo {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document document = builder.newDocument();
			
			Element root = document.createElement("student");
			document.appendChild(root);
			
			Element stud1 = document.createElement("studentFirstName");
			stud1.appendChild(document.createTextNode("Harry"));
			Element stud2 = document.createElement("studentLastName");
			stud2.appendChild(document.createTextNode("Potter"));
			Element stud3 = document.createElement("studentMark");
			stud3.appendChild(document.createTextNode("70"));
			
			root.appendChild(stud1);
			root.appendChild(stud2);
			root.appendChild(stud3);
			
			// now write this to a xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			
			StreamResult result = new StreamResult("output.xml");
			transformer.transform(source, result);
			System.out.println("File writtern successfully...");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
