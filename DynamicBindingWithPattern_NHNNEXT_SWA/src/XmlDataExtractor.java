// reference : http://www.rhyous.com/2011/10/23/android-and-xml-serialization-with-simple/
// parser work with simple FrameWork(http://simple.sourceforge.net/download.php)

import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class XmlDataExtractor {
			
	public static String xmlExtractor(){
		XmlData methodByXml = null;
		File xmlFile = new File("SortOption.xml");
		
		try {
			Serializer serializer = new Persister();
			methodByXml = serializer.read(XmlData.class, xmlFile);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return methodByXml.getMessage();
	}
}
