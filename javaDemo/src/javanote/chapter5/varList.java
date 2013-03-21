package javanote.chapter5;

public class varList {
	//varargs
	public void printArr(float c, String...strlist) {
		for(String str : strlist) {
			System.out.println(str);
		}
	}
	
	public void printex(Integer...list) {
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("2"+list.getClass());//prove it is not autoboxing
	}
	
	public void printex(Character...list){
		for(Character f : list){
			System.out.println("1"+f);
		}
		
	}
	
	public void printex3(int a,Character...list) {
		for(Character i : list) {
			System.out.println(i);
		}
		System.out.println("2"+list.getClass());//prove it is not autoboxing
	}
	
	public void printex3(Character...list){
		for(Character f : list){
			System.out.println("1"+f);
		}
		
	}
	
	public void printex4(int a,Character...list) {
		for(Character i : list) {
			System.out.println(i);
		}
		System.out.println("2"+list.getClass());//prove it is not autoboxing
	}
	
	public void printex4(char c,Character...list){
		for(Character f : list){
			System.out.println("1"+f);
		}
		
	}
	
	
	public void printex2(int j,int...list) {
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println(list.getClass());//prove it is not autoboxing
	}
	
	public void printex2(float...list){
		for(float f : list){
			System.out.println(f);
		}
		
	}
	
	public static void main(String[] args) {
		varList varclass = new varList();
		varclass.printArr(1.0f, "a","b");
		varclass.printArr(1.0f);
		//varclass.printex();//wrong 基本类型没有问题
		varclass.printex2(1,1);
		varclass.printex3(1,'a');
		//varclass.printex3('b','a');//wrong
		varclass.printex4(1,'a');
		varclass.printex4('b','a');
		
	}
	
	
}