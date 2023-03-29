package day10;

public class Staticmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticExample.a);//we can access directly without creation object because main method is static
		//System.out.println(b);
		StaticExample.m1();
		//m2();//m2 is non static so we can not access directly

	}

}
