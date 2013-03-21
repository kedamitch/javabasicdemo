package javanote.chapter5.exercise;

public class Exercise17 {
	
	public Exercise17(String str) {
		System.out.println(str);
		Exercise17[] exlist = new Exercise17[10];// prove it's only an array of reference 
	}
	
	public static void main(String[] args) {
		Exercise17 ex17 = new Exercise17("feifei");
	}
}