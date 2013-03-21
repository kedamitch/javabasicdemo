package javanote.chapter5.exercise;

public class Exercise18 {
	
	public Exercise18(String str) {
		System.out.println(str);
		//dead loop
		/**
		 * it comes with error below:
		 * Exception in thread "main" java.lang.StackOverflowError
		 * at java.io.BufferedOutputStream.write(Unknown Source)
	     * at java.io.PrintStream.write(Unknown Source)
	     * at sun.nio.cs.StreamEncoder.writeBytes(Unknown Source)
	     * at sun.nio.cs.StreamEncoder.implFlushBuffer(Unknown Source)
		 */
		Exercise18[] exlist = new Exercise18[10];//dead loop
		for(int i=0;i<exlist.length;i++) {
			exlist[i] = new Exercise18("feifei");
		}
	}
	
	public static void main(String[] args) {
		Exercise18 ex18 = new Exercise18("feifei");
	}
}