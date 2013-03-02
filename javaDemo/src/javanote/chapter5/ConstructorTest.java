package javanote.chapter5;

public class ConstructorTest {
	
	private int _a = 0;
	
	private ConstructorTest(int i) {
		this._a = i;
	}
	
	public static ConstructorTest getInstance() {
		return new ConstructorTest(1);
	}
	
	public ConstructorTest() {
		this(1);
	}
	// wrong	d
//	public ConstructorTest(long i) {
//		int i;
//		this(1);
//	}
//	
	public void print() {
		System.out.println(_a);
	}
	
}