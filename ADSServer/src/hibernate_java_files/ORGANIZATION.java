package hibernate_java_files;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ORGANIZATION {
	
	
	
	public ORGANIZATION()
	{
		
		
	}
	
	
	
	
	private int ORG_ID;
	
	private String ORG_NAME;
	
	private String ORG_TYPE;
	
	private int TOTAL_EMPLOYEE;
	
	private String ORG_GOALS;
	
	private String  ORG_DETAILS;
	
	private String ORG_STATUS;
	
	private String ORG_PHONE;
	
	private String ORG_WEBSITE;
	
	private String USER_ID;
	
	private String ORG_ADDRESS;

	public int getORG_ID() {
		return ORG_ID;
	}

	public void setORG_ID(int oRG_ID) {
		ORG_ID = oRG_ID;
	}

	public String getORG_NAME() {
		return ORG_NAME;
	}

	public void setORG_NAME(String oRG_NAME) {
		ORG_NAME = oRG_NAME;
	}

	public String getORG_TYPE() {
		return ORG_TYPE;
	}

	public void setORG_TYPE(String oRG_TYPE) {
		ORG_TYPE = oRG_TYPE;
	}

	public int getTOTAL_EMPLOYEE() {
		return TOTAL_EMPLOYEE;
	}

	public void setTOTAL_EMPLOYEE(int tOTAL_EMPLOYEE) {
		TOTAL_EMPLOYEE = tOTAL_EMPLOYEE;
	}

	public String getORG_GOALS() {
		return ORG_GOALS;
	}

	public void setORG_GOALS(String oRG_GOALS) {
		ORG_GOALS = oRG_GOALS;
	}

	public String getORG_DETAILS() {
		return ORG_DETAILS;
	}

	public void setORG_DETAILS(String oRG_DETAILS) {
		ORG_DETAILS = oRG_DETAILS;
	}

	public String getORG_STATUS() {
		return ORG_STATUS;
	}

	public void setORG_STATUS(String oRG_STATUS) {
		ORG_STATUS = oRG_STATUS;
	}

	public String getORG_PHONE() {
		return ORG_PHONE;
	}

	public void setORG_PHONE(String oRG_PHONE) {
		ORG_PHONE = oRG_PHONE;
	}

	public String getORG_WEBSITE() {
		return ORG_WEBSITE;
	}

	public void setORG_WEBSITE(String oRG_WEBSITE) {
		ORG_WEBSITE = oRG_WEBSITE;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getORG_ADDRESS() {
		return ORG_ADDRESS;
	}

	public void setORG_ADDRESS(String oRG_ADDRESS) {
		ORG_ADDRESS = oRG_ADDRESS;
	}

	public ORGANIZATION(String oRG_NAME, String oRG_TYPE, int tOTAL_EMPLOYEE, String oRG_GOALS,
			String oRG_DETAILS, String oRG_STATUS, String oRG_PHONE, String oRG_WEBSITE, String uSER_ID,
			String oRG_ADDRESS) {
		
	
		ORG_NAME = oRG_NAME;
		ORG_TYPE = oRG_TYPE;
		TOTAL_EMPLOYEE = tOTAL_EMPLOYEE;
		ORG_GOALS = oRG_GOALS;
		ORG_DETAILS = oRG_DETAILS;
		ORG_STATUS = oRG_STATUS;
		ORG_PHONE = oRG_PHONE;
		ORG_WEBSITE = oRG_WEBSITE;
		USER_ID = uSER_ID;
		ORG_ADDRESS = oRG_ADDRESS;
	}
	
	
	

}
