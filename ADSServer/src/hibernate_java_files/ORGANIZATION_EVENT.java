package hibernate_java_files;

public class ORGANIZATION_EVENT {
	
	
	
	public ORGANIZATION_EVENT()
	{
		
		
	}
	
	
	private int EVENT_ID;
	
	private String EVENT_NAME;
	
	private String EVENT_TYPE;
	
	private String EVENT_LOCATION;
	
	private String EVENT_DATE;
	
	public int getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(int eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public String getEVENT_NAME() {
		return EVENT_NAME;
	}

	public void setEVENT_NAME(String eVENT_NAME) {
		EVENT_NAME = eVENT_NAME;
	}

	public String getEVENT_TYPE() {
		return EVENT_TYPE;
	}

	public void setEVENT_TYPE(String eVENT_TYPE) {
		EVENT_TYPE = eVENT_TYPE;
	}

	public String getEVENT_LOCATION() {
		return EVENT_LOCATION;
	}

	public void setEVENT_LOCATION(String eVENT_LOCATION) {
		EVENT_LOCATION = eVENT_LOCATION;
	}

	public String getEVENT_DATE() {
		return EVENT_DATE;
	}

	public ORGANIZATION_EVENT(String eVENT_NAME, String eVENT_TYPE, String eVENT_LOCATION,
			String eVENT_DATE, int oRG_ID) {
		
		
		EVENT_NAME = eVENT_NAME;
		EVENT_TYPE = eVENT_TYPE;
		EVENT_LOCATION = eVENT_LOCATION;
		EVENT_DATE = eVENT_DATE;
		ORG_ID = oRG_ID;
	}

	public void setEVENT_DATE(String eVENT_DATE) {
		EVENT_DATE = eVENT_DATE;
	}

	public int getORG_ID() {
		return ORG_ID;
	}

	public void setORG_ID(int oRG_ID) {
		ORG_ID = oRG_ID;
	}


	private int ORG_ID;
	
	
	

}
