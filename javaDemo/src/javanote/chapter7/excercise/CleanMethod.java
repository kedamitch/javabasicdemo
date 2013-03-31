package javanote.chapter7.excercise;
/**
 * java Îö¹¹·½·¨
 * @author mitty
 *
 */
public class CleanMethod extends S {
	 int s = 7;
	 public void cleanup() {
		 s = 0;
		 super.cleanup();
	 }
	 
	 public static void main(String...args) {
		 CleanMethod c = new CleanMethod();
		 c.cleanup();
		 System.out.println(c.s);
		 System.out.println(c.i);
	 }
}


class S {
	int i;
	protected void cleanup() {
		i = 0;
	}
}