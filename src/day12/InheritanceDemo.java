 package day12;
 
 interface Shape
 {
	 int length=10;//final &static
	 int width=20;
	 
	 void circle();//abstract method-un implemented
	 default void square()//default method
	 {
		 System.out.println("This is square default method");
	 }
	 static void rectangle()//static method
	 {
		 System.out.println("This is rectangle");
	 }
	 void data();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

public class InheritanceDemo implements Shape
{
	 public void circle() {
		System.out.println("This is circle");
		
	}
	public void data() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDemo intfc=new InheritanceDemo();
		intfc.circle();
		intfc.square();//default
		intfc.data();//abstract
		Shape.rectangle();//static
		Shape sh=new InheritanceDemo();
		sh.circle();
		sh.data();
		sh.square();
	}

	
	

}
