package javanote.chapter6.excercise;

public class Excercise4 extends Excercise1 {
	public static void main(String...args){
		Excercise4 ex4 = new Excercise4();
		System.out.println(ex4.s);//protected
		System.out.println(ex4.ss);//package
		ex4.print1();
		ex4.print2();
	}
}