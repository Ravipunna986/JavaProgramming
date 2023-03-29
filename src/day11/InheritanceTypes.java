package day11;

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c;
	void print()
	{
	System.out.println(c);	
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {

C cObject=new C();	
cObject.display();
cObject.show();
cObject.c=50;
		cObject.print();
	}

}
