package javanote.chapter5;

class animal {
	public static house h1 = new house(1);
	
	house h2 = new house(2);
	
	static {
		System.out.println("start static block");
		house h3 = new house(3);
		System.out.println("end static block");
	}
	animal() {
		System.out.println("i am an animal!");
	}
}

class cat extends animal {
	static house h4 = new house(4);
	house h5 = new house(5);
	static {
		System.out.println("haha");
	}
	cat() {
		System.out.println("i am a cat");
	}
}

class house {
	
	house(int i) {
		System.out.println("i have " + i + " house!");
	}
	
}

public class InitOrderTest {
	public static void main(String[] args) {
		cat c = new cat();
	}
}