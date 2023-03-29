package day4;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=52;
		c=23;
		if (a<b&&a<c) {
			System.out.println("a is smallest number");
		}
		else if(b<c&&b<a) {
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest");
		}
	}

}
