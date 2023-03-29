package day3;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//Swapping of two numbers
		
		int a=10,b=20;
		int c;
		c=a;
		a=b;
		b=c;
System.out.println(a);
		
	System.out.println(b);	
		
		String a1="ravi",b1="punna";
		String c1;
		
		c1=a1;
		a1=b1;
		b1=c1;
		System.out.println(a1+b1);
		
	int a11=30,b11=40;	
		a11=a11-b11;
		b11=a11+b11;
		a11=b11-a11;
		System.out.println(a11);
	//	b11=a11;
		System.out.println(b11);
		
	
		int d=3,e=5;
		d=d*e;
		System.out.println(d);
		e=d/e;
		System.out.println(e);
		d=d/e;
		System.out.println(d);
		
		System.out.println(d+" "+e);
		
		e=d+e-(d=e);
		System.out.println(d+" "+e);
		
		
		
		
	}

}
