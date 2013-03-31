package javanote.chapter7.excercise;

public final class FinalTest {
	private final int num = 10;
	private int[] a = new int[num];//compile constant
	private final int s;//must be init 
	
	public FinalTest() {
		this.s =1;
	}
	
	public void print(final int i) {
		System.out.println(i+1);
		//i = i+1; error
	}
	
	
	public static void main(String...args){
		FinalTest test = new FinalTest();
		System.out.println(test.num);
		test.print(10);
	}
	
}

//class FF extends FinalTest {
//	
//}
// final class cannot be extended