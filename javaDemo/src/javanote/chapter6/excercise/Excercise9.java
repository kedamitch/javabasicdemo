package javanote.chapter6.excercise;

public class Excercise9 {
	private int[] connections;
	
	private static int i = 0;
	
	private Excercise9() {
		connections = new int[10];
	}
	
	public static Excercise9 getEx9() {
		if(i==0) {
			System.out.println("null");
			i++;
			return new Excercise9();
		} else {
			return new Excercise9();
		}
	}
	
	public static void main(String...args) {
		Excercise9 ex = Excercise9.getEx9();
		Excercise9 ex1 = Excercise9.getEx9();
		
	}
	
}