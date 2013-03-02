package javanote.chapter5;

public class TestMain {
	public static void main(String[] args) {
		ConstructorTest test = new ConstructorTest();
		test.print();
		ConstructorTest test2 = ConstructorTest.getInstance();
		test2.print();
	}
} 