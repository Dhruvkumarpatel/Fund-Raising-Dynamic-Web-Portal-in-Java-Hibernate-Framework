package hibernate_java_files;

public class PROJECT {
	
	public PROJECT()
	{
		
		
	}
	

		private int PROJECT_ID;
		
		private String PROJECT_NAME;
		
		private String PROJECT_TYPE;
		
		private String PROJECT_DETAILS;
		
		private int ORG_ID;

		
		
		
		public PROJECT(String pROJECT_NAME, String pROJECT_TYPE, String pROJECT_DETAILS,
				int oRG_ID) {
			
		
			PROJECT_NAME = pROJECT_NAME;
			PROJECT_TYPE = pROJECT_TYPE;
			PROJECT_DETAILS = pROJECT_DETAILS;
			ORG_ID = oRG_ID;
		}

		public int getPROJECT_ID() {
			return PROJECT_ID;
		}

		public void setPROJECT_ID(int pROJECT_ID) {
			PROJECT_ID = pROJECT_ID;
		}

		public String getPROJECT_NAME() {
			return PROJECT_NAME;
		}

		public void setPROJECT_NAME(String pROJECT_NAME) {
			PROJECT_NAME = pROJECT_NAME;
		}

		public String getPROJECT_TYPE() {
			return PROJECT_TYPE;
		}

		public void setPROJECT_TYPE(String pROJECT_TYPE) {
			PROJECT_TYPE = pROJECT_TYPE;
		}

		public String getPROJECT_DETAILS() {
			return PROJECT_DETAILS;
		}

		public void setPROJECT_DETAILS(String pROJECT_DETAILS) {
			PROJECT_DETAILS = pROJECT_DETAILS;
		}

		public int getORG_ID() {
			return ORG_ID;
		}

		public void setORG_ID(int oRG_ID) {
			ORG_ID = oRG_ID;
		}
		
	
}
