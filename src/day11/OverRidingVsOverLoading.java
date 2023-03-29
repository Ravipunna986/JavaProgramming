package day11;

class ABCD{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b){
		System.out.println(b);
	}
}

class WXYZ extends ABCD
{
	void m1(int a) {//Over rided Method
		System.out.println(a*a);
	}
	void m2(int a ,int b){//Overloaded method
		System.out.println(b+a);
	}

}



public class OverRidingVsOverLoading {

	public static void main(String[] args) {
WXYZ xyz=new WXYZ();
xyz.m1(10);
xyz.m2(20);
xyz.m2(20, 6);
	}

}
