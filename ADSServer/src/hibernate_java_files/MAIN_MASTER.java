package hibernate_java_files;

public class MAIN_MASTER {
	
	public MAIN_MASTER()
	{
		
		
	}
	
	public MAIN_MASTER(String uSER_ID, String pASSWORD, String uSER_TYPE, String eMAIL_ID, String fNAME,
			String lNAME) {
		
		
		USER_ID = uSER_ID;
		PASSWORD = pASSWORD;
		USER_TYPE = uSER_TYPE;
		EMAIL_ID = eMAIL_ID;
		FNAME = fNAME;
		LNAME = lNAME;
	}
	

	private int ID_INDEX;
	
	private String USER_ID;
	
	private String PASSWORD;
	
	private String USER_TYPE;
	
	private String EMAIL_ID;
	
	private String FNAME;
	
	private String LNAME;

	public int getID_INDEX() {
		return ID_INDEX;
	}

	public void setID_INDEX(int iD_INDEX) {
		ID_INDEX = iD_INDEX;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getUSER_TYPE() {
		return USER_TYPE;
	}

	public void setUSER_TYPE(String uSER_TYPE) {
		USER_TYPE = uSER_TYPE;
	}

	public String getEMAIL_ID() {
		return EMAIL_ID;
	}

	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}

	public String getFNAME() {
		return FNAME;
	}

	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}

	public String getLNAME() {
		return LNAME;
	}

	public void setLNAME(String lNAME) {
		LNAME = lNAME;
	}
	
	
	
	

}
