package hibernate_java_files;

public class ORGANIZATION_EXPENSE {
	
	
	
	public ORGANIZATION_EXPENSE()
	{
		
		
	}
	
	private int EXPENSE_ID;
	
	private String EXPENSE_TYPE;
	
	private String EXPENSE_DETAILS;
	
	private String EXPENSE_NAME;
	
	private String EXPENSE_DATE;
	
	public ORGANIZATION_EXPENSE(String eXPENSE_TYPE, String eXPENSE_DETAILS, String eXPENSE_NAME,
			String eXPENSE_DATE, int oRG_ID) {
		
		
		EXPENSE_TYPE = eXPENSE_TYPE;
		EXPENSE_DETAILS = eXPENSE_DETAILS;
		EXPENSE_NAME = eXPENSE_NAME;
		EXPENSE_DATE = eXPENSE_DATE;
		ORG_ID = oRG_ID;
	}

	public int getEXPENSE_ID() {
		return EXPENSE_ID;
	}

	public void setEXPENSE_ID(int eXPENSE_ID) {
		EXPENSE_ID = eXPENSE_ID;
	}

	public String getEXPENSE_TYPE() {
		return EXPENSE_TYPE;
	}

	public void setEXPENSE_TYPE(String eXPENSE_TYPE) {
		EXPENSE_TYPE = eXPENSE_TYPE;
	}

	public String getEXPENSE_DETAILS() {
		return EXPENSE_DETAILS;
	}

	public void setEXPENSE_DETAILS(String eXPENSE_DETAILS) {
		EXPENSE_DETAILS = eXPENSE_DETAILS;
	}

	public String getEXPENSE_NAME() {
		return EXPENSE_NAME;
	}

	public void setEXPENSE_NAME(String eXPENSE_NAME) {
		EXPENSE_NAME = eXPENSE_NAME;
	}

	public String getEXPENSE_DATE() {
		return EXPENSE_DATE;
	}

	public void setEXPENSE_DATE(String eXPENSE_DATE) {
		EXPENSE_DATE = eXPENSE_DATE;
	}

	public int getORG_ID() {
		return ORG_ID;
	}

	public void setORG_ID(int oRG_ID) {
		ORG_ID = oRG_ID;
	}

	private int ORG_ID;
	
	

}
