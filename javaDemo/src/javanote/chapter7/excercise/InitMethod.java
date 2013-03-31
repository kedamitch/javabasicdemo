package javanote.chapter7.excercise;

public class InitMethod {
	
	public A a;
	int i=1;//定义处初始化
	String str;
	String s2;
	{
		str="aaa";//使用时初始化
	}
	public InitMethod() {
		s2="ss";//constructor init
	}
	public static void main(String...args){
		InitMethod m = new InitMethod();
		if(m.a==null){
			m.a= new A();//delay init
		}
		System.out.println(m.a.s);
		System.out.println(m.str);
		System.out.println(m.s2);
		System.out.println(m.i);
	}
	
}

class A {
	int s=1;
}