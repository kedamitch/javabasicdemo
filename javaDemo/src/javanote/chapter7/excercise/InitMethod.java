package javanote.chapter7.excercise;

public class InitMethod {
	
	public A a;
	int i=1;//���崦��ʼ��
	String str;
	String s2;
	{
		str="aaa";//ʹ��ʱ��ʼ��
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