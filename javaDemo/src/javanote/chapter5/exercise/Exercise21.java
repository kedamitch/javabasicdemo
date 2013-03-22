package javanote.chapter5.exercise;

public class Exercise21 {
	enum money {
		A,B,C;
	}
	
	public static void main(String...args){
		money x = money.A;
		
		for(money y : money.values()) {
			System.out.println(y + "   " + y.ordinal() + "    " + y.toString() + "    " + y.name());
			switch(y) {
//			case money.A :
//				System.out.println("this is A");
//				break;
// above is wrong for reason:
//			When using enums in a switch, it is almost natural to assume they will be used like a regular switch. Unfortunately to accomodate enums, Java had to enhance its specification and enums in switch behave differently than regular switch statements in two significant and non-trivial ways.
//
//			Sun's Javac says -"enum switch case label must be the unqualified name of an enumeration constant. in its cryptic error message. That's probably French to many. I know I had a tough time understanding this statement.
			case A:
				System.out.println("this is A");
				break;
			case B:
				System.out.println("this is B");
				
			}
		}
		
	}
	
}