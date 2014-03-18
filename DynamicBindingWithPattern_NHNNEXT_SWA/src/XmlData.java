import org.simpleframework.xml.*;

@Root
public class XmlData {
	@Element
	private String method;
	
	public XmlData() {
		super();
	}
	
	public XmlData( String method ) {
		this.method = method;
	}
	
	public String getMessage() {
		return method;
	}
}
