package day10;

public class StaticExample {
	
	static int a=10;
	int b=20;
	static void m1() {
		System.out.println("This is static method");
	}
	
	void m2() {
		System.out.println("This is non static method");
	}
	static void m3() {
	//System.out.println(b); here we can not access static methods directly	
	}
	void m4() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		//here we can access all static and non static methods coz non static methods can acess all the data with out creating object
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);//we can access directly without creation object because main method is static
		//System.out.println(b);
		m1();
		//m2();//m2 is non static so we can not access directly

	}

}
