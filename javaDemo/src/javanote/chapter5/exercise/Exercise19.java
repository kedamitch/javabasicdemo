package javanote.chapter5.exercise;

public class Exercise19 {
	public void printstr(String...list){
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Exercise19 ex = new Exercise19();
		ex.printstr("a","b");
		ex.printstr(new String[]{"a","b"});
	}
}