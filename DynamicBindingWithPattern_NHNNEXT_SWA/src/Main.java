////////////////////////////////////////////////////
// NHN NEXT Software Architecting Class
// 2014. 3. 19
// Code Writer: Dong Chan Shin
////////////////////////////////////////////////////

public class Main {

	public static void main(String[] args) {
		
		int sample[] = {5,3,7,1,9};
		
		ISort sorter = null;
		
		//XmlDataExtractor xmlExtractor = new XmlDataExtractor(); 
		//String method = xmlExtractor.xmlExtractor();
		
		try {
			sorter = (ISort) Class.forName(XmlDataExtractor.xmlExtractor()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sorter.sort(sample);
	}

}
