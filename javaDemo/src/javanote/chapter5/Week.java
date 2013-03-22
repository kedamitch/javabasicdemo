package javanote.chapter5;

public enum Week {
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
	
	private final int index;
	
	Week(int i) {
		this.index = i;
	}
	
	public int getIndex() {
		return this.index;
	}
	
}