package javanote.chapter5.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise16 {
	
	public static void main(String[] args) {
		String[] strList = new String[(new Random()).nextInt(200)];
		for(int i=0;i<strList.length;i++) {
			strList[i] = "feifei";
		}
		System.out.println(Arrays.toString(strList));
	}
	
}
