package xml01;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLParserBeispiel {

	public static void main(String[] args) {
		try {
// Erstelle einen DocumentBuilder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(true); // Default is false
			
			DocumentBuilder builder = factory.newDocumentBuilder();

			
//Analysiere die XML-Datei
			Document doc = builder.parse("personen.xml");
			
//Holen Sie das Wurzelelement
			Element root = doc.getDocumentElement();
			
//Holen Sie alle Person-Elemente
			NodeList personList = root.getElementsByTagName("Person");
			
//Durchlaufe jedes Person-Element
			for (int i = 0; i < personList.getLength(); i++) {
				Element personElement = (Element) personList.item(i);
				String name = personElement.getElementsByTagName("Name").item(0).getTextContent();
				String alter = personElement.getElementsByTagName("Alter").item(0).getTextContent();
				String stadt = personElement.getElementsByTagName("Stadt").item(0).getTextContent();
//Mach etwas mit den Personen-Daten
				System.out.println("Person " + (i + 1) + ":");
				System.out.println("Name: " + name);
				System.out.println("Alter: " + alter);
				System.out.println("Stadt: " + stadt);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}