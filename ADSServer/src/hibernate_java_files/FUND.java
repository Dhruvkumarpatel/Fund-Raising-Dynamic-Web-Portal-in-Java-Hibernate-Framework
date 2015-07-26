package hibernate_java_files;

public class FUND {

		public FUND()
		{
			
			
			
		}
		
		
		private int FUND_ID;
		
		private int FUND_AMOUNT;
		
		//private int TOTAL_FUND_AMOUNT;
		
		private int ORG_ID;

		public int getFUND_ID() {
			return FUND_ID;
		}

		public void setFUND_ID(int fUND_ID) {
			FUND_ID = fUND_ID;
		}

		public int getFUND_AMOUNT() {
			return FUND_AMOUNT;
		}

		public void setFUND_AMOUNT(int fUND_AMOUNT) {
			FUND_AMOUNT = fUND_AMOUNT;
		}

	/*	public int getTOTAL_FUND_AMOUNT() {
			return TOTAL_FUND_AMOUNT;
		}

		public void setTOTAL_FUND_AMOUNT(int tOTAL_FUND_AMOUNT) {
			TOTAL_FUND_AMOUNT = tOTAL_FUND_AMOUNT;
		}
*/
		public int getORG_ID() {
			return ORG_ID;
		}

		public void setORG_ID(int oRG_ID) {
			ORG_ID = oRG_ID;
		}

		public FUND(int fUND_AMOUNT,int oRG_ID) {
		
		
			FUND_AMOUNT = fUND_AMOUNT;
	//		TOTAL_FUND_AMOUNT = tOTAL_FUND_AMOUNT;
			ORG_ID = oRG_ID;
		}

	
		
		
	
	
	
}
