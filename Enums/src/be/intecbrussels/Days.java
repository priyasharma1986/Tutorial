package be.intecbrussels;

public enum Days {
	
	SUNDAY(false), 
	MONDAY(true), 
	TUESDAY(true), 
	WEDNESDAY(true), 
	THURSDAY(true), 
	FRIDAY(true), 
	SATURDAY(false);

	private final boolean WEEKDAY;
	
	Days(boolean WEEKDAY) {
		this.WEEKDAY = WEEKDAY;
		
	}
	
	
	public boolean getWEEKDAY() {
		return WEEKDAY;
		
	}
	public String toString() {
		return "Days{ " + "weekday=" + WEEKDAY + "} ";
	}
	
	
	
}
