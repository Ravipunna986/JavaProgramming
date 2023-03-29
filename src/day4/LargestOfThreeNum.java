package day4;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=10;
		c=10;
		if (a>b&&a>c) {
			System.out.println("a is largest");
		}
		else if(b>a&&b>c){
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
	}

}
